package com.company;
import java.util.Locale;
import java.util.Scanner;

public class Yash7_Strings {
    public static void main(String[] args) {
        String name = new String("Test");
        //strings are immutable in java
        System.out.println(name);
        Scanner sc = new Scanner(System.in);
        String test = sc.nextLine();
        System.out.println(test);
        System.out.printf("The value is %d", 5);
        //printf & format are almost same thing

        //Methods
        System.out.println(test.length());
        System.out.println(test.toLowerCase());
        System.out.println(test.trim()); //removes leading and trailing spaces
        System.out.println(test.substring(1,3));
        System.out.println(test.replace("Yash","Testing"));
        System.out.println(test.startsWith("Test"));
        System.out.println(test.charAt(1));
        System.out.println(test.indexOf("Test"));
        System.out.println(test.indexOf("Test",5));
        System.out.println(test.lastIndexOf("a",4));
    }
}
