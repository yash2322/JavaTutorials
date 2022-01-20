package com.company;

import java.util.Scanner;

public class Yash4_PercentageCalc {
    public static void main(String[] args) {
        System.out.println("Enter the number of subjects");
        Scanner sc = new Scanner(System.in);
        int subjects = sc.nextInt();
        System.out.println("Enter the numbers");
        int marksTotal = 0;
        for(int i=0;i<subjects;i++){
            marksTotal += sc.nextInt();
        }
        double percentageFinal = (marksTotal/Double.valueOf(subjects));
        System.out.println(percentageFinal);
    }
}
