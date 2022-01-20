package com.company;
import java.util.Scanner;

public class Yash3_Inputs {
    public static void main(String[] args) {
        System.out.println("Test"); //Sout
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num1 = sc.nextInt();
        System.out.println("Enter anoher number");
        int num2 = sc.nextInt();
        System.out.println("Number is " + (num1 + num2));
        boolean testHasNext = sc.hasNextInt();
        System.out.println(testHasNext);
        String str = sc.next();
        System.out.println(str);
    }
}
