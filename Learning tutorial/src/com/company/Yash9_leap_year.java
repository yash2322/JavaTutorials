package com.company;
import java.util.Scanner;
public class Yash9_leap_year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year%400 == 0){
            System.out.println("It is leap");
        } else if (year%4 == 0 && year%100 !=0 ){
            System.out.println("It is leap");
        } else {
            System.out.println("Not a leap");
        }

    }
}
