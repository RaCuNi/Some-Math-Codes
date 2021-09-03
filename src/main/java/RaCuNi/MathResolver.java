package main.java.RaCuNi;

import java.util.Scanner;

public class MathResolver {

    int a = 0;
    int b = 0;
    int c = 0;
    int d = 0;

    public static void main(String[] args) {
        System.out.println("Hello World!");

        System.out.println("This program made for the purpose of interest.");
        System.out.println("We will apply the 'Intermediate Value Theorem.");
        System.out.println("To do that, you have to initialize a function.");
        System.out.println("The function can be defined from linear function to cubic function (ex: y=x, y=x^2, y=x^3");
        System.out.println("We will use the general form of cubic function.");
        System.out.println("y=ax^3+bx^2+cx+d");
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

        System.out.println("The form of the function is : " + String.valueOf(a)+"x^3"+String.valueOf(b)+"+x^2"+String.valueOf(c)+"+x"+String.valueOf(d));

    }

}
