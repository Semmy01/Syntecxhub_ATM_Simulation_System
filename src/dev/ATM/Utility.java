package dev.ATM;

import java.util.Scanner;

public class Utility {

    public static void displayOptions(ATM atm){

        Scanner scanner = new Scanner(System.in);
        int userInput ;

        do {
            System.out.print("Enter 1 to Deposit \n" +
                    "Enter 2 to check balance \n" +
                    "Enter 3 to Withdraw \n" +
                    "Enter 4 to change PIN \n" +
                    "Enter 5 to Leave : ");
            userInput = scanner.nextInt();
            System.out.println("-".repeat(30));
            switch (userInput){
                case 1 -> {
                    atm.deposit();
                }
                case 2 -> {
                    atm.checkBalance();
                }
                case 3 -> {
                    atm.withdraw();
                }
                case 4 -> {
                    System.out.println("Change Pin");
                    atm.changePin();
                }
                case 5 -> {
                    System.out.println("Thanks for using our ATM");
                }
                default -> {
                    System.out.println("Enter a valid number");
                }
            }
        }while(userInput != 5);
    }
}
