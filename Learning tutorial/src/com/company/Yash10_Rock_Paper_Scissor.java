package com.company;
import java.util.Scanner;
import java.util.Random;

public class Yash10_Rock_Paper_Scissor {
    public static void main(String[] args) {
        System.out.println("Enter the number of games you want to play");
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();
        int games = sc.nextInt();
        while (games>0){
            System.out.println("Enter your choice between r,p,s");
            String userChoice =  sc.next();
            int userChoiceValue = 0, computerChoice;
            computerChoice = rn.nextInt(1,4);
            System.out.println(computerChoice);
            switch (userChoice){
                case "r" -> userChoiceValue = 1;
                case "p" -> userChoiceValue = 2;
                case "s" -> userChoiceValue = 3;
            };
            if (userChoiceValue == computerChoice){
                System.out.println("TIED");
            } else if (userChoiceValue > computerChoice){
                System.out.println("User won this match");
            } else {
                System.out.println("Computer won this match");
            }
            games--;
        }
    }
}
