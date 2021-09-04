package main.java.RaCuNi;

import java.util.Scanner;

public class MathResolver {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        ivt();
    }

    public static void ivt() {
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

        System.out.print("Now, you have to define the interval of the function. (ex: [m,l] - type of int)");

        System.out.println("Enter the value of m");
        int m = sc.nextInt();

        System.out.println("Enter the value of l");
        int l = sc.nextInt();

        System.out.println("The interval is : " +"["+String.valueOf(m)+","+String.valueOf(l)+"]");

        System.out.println("Okay. Let's check if there is any solution of f(x)=0 at the interval.");

        double fm = a * Math.pow(m, 3) + b * Math.pow(m, 2) + c * m + d;
        double fl = a * Math.pow(l, 3) + b * Math.pow(l, 2) + c * l + d;

        if(fm*fl<0) {
            System.out.println("There must be at least one solution.");
        } else {
            System.out.println("Can't apply IVT.");
        }
        
    }

}
