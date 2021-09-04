package main.java.RaCuNi;

import java.util.Scanner;

public class MathResolver {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        MathResolver mr = new MathResolver();
        mr.ivt();
    }

    public void ivt() {
        System.out.println("This program made for the purpose of interest.");
        System.out.println("We will apply the 'Intermediate Value Theorem to check if there is any solution of f(x)=0 at a particular interval.'");
        System.out.println("To do that, you have to initialize the function f(x).");
        System.out.println("y=f(x) can be defined from linear function to cubic function (ex: y=x, y=x^2, y=x^3)");
        System.out.println("We will use the general form of cubic function.");
        System.out.println("'f(x)=ax^3+bx^2+cx+d'");
        System.out.println("Now, tell us the coefficients(a,b,c,d : type of int).");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a.");
        int a = sc.nextInt();

        System.out.println("Enter the value of b.");
        int b = sc.nextInt();

        System.out.println("Enter the value of c.");
        int c  = sc.nextInt();

        System.out.println("Enter the value of d.");
        int d = sc.nextInt();

        System.out.println("The form of the function is : " + String.valueOf(a)+"x^3" +"+"+String.valueOf(b)+"x^2" +"+"+String.valueOf(c)+"x" +"+"+String.valueOf(d));

        System.out.print("Now, you have to define the interval of the function. (ex: [m,l] - type of int, m < l)");

        System.out.println("Enter the value of m");
        int m = sc.nextInt();

        System.out.println("Enter the value of l");
        int l = sc.nextInt();

        System.out.println("The interval is : " +"["+String.valueOf(m)+","+String.valueOf(l)+"]");

        System.out.println("Okay. Let's check if there is any solution of f(x)=0 at the interval.");

        //double fm = a * Math.pow(m, 3) + b * Math.pow(m, 2) + c * m + d;
        //double fl = a * Math.pow(l, 3) + b * Math.pow(l, 2) + c * l + d;

        if(/*(fm*fl<0*/ f(a,b,c,d,m) * f(a,b,c,d,l)<0) {
            System.out.println("There must be at least one solution.");

            System.out.println("Now, we will calculate the approximation of the solution.");
            System.out.println("Enter the number of loops. (type of int)");
            int r = sc.nextInt();

            double[] approximation = loop(r, a, b, c, d, m, l);
            System.out.println("The approximation is : "+approximation[0]+" < "+"x"+" < "+approximation[1]);

        } else {
            System.out.println("Can't apply IVT.");
        }

        sc.close();
        
    }

    public double f(int a, int b, int c, int d, double k) {
        double fk = a * Math.pow(k, 3) + b * Math.pow(k, 2) + c * k + d;
        return fk;
    }

    public double half(double m, double l) {
        double result = (m+l)/2;
        return result;
    }

    public double[] process(int a, int b, int c, int d, double m, double l) {

        double[] intervalValues = {m, half(m, l), l};

        if(f(a,b,c,d,m)*f(a,b,c,d,half(m,l)) < 0 && f(a,b,c,d,half(m,l))*f(a,b,c,d,l) < 0 ) {
            System.out.println("I can't hold it.");
            return null;
        } 
        
        else if(f(a,b,c,d,m)*f(a,b,c,d,half(m,l)) < 0) {
            System.out.println("There must be at least one solution at "+"("+m+","+half(m, l)+")");
            double[] caseOne = {intervalValues[0], intervalValues[1]};
            return caseOne;
        } else {
            System.out.println("There must be at least one solution at "+"("+half(m, l)+","+l+")");
            double[] caseTwo = {intervalValues[1], intervalValues[2]};
            return caseTwo;
        }
    }

    public double[] loop(int r, int a, int b, int c, int d, double m, double l) {

        double[] result = process(a, b, c, d, m, l);

        if(r==1) {
            return result;
        }

        return loop(r-1, a, b, c, d, result[0], result[1]);
    }

}
