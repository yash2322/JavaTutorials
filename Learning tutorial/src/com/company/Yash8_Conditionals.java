package com.company;
import java.util.Scanner;

public class Yash8_Conditionals {
    public static void main(String[] args) {
        String fuckedUp = "Yes";
        if (fuckedUp.equalsIgnoreCase("yes")){
            System.out.println("To bc");
        } else {
            System.out.println("Chutiya ho tum");
        }
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        switch (name){
            case "Yash":
                System. out.println("Name is Yash");
                break;
            case "Nikhil":
                System.out.println("Name is Nikhil");
                break;
            default:
                System.out.println("Default");
        }
        //enhanced switch
        switch (name) {
            case "Yash" -> System.out.println("Name is Yash");
            case "Nikhil" -> System.out.println("Name is Nikhil");
            default -> System.out.println("Defualt");
        }
    }
}
