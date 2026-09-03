package dev.ATM;

import java.util.Scanner;

public class ATM {
    Scanner scanner = new Scanner(System.in);

    private User user;

    public ATM(){

    };

    public void setUser(User user){
        this.user = user;
    }

    public void deposit(){
        System.out.print("Enter the amount  to be deposited : ");
        double amount = scanner.nextDouble();
        scanner.nextLine();

        if (amount < 0){
            System.out.println("Invalid Input");
            System.out.println("-".repeat(30));
            return;
        }

        System.out.print("Enter your secret PIN number : ");
        String usersInputtedPin = scanner.nextLine();

        if ( user.getUserPin().equals(usersInputtedPin) ){
            user.setUserNewBalance(amount);
            System.out.println("....Deposit Successful");
        } else {
            System.out.println("Incorrect PIN");
        }
        System.out.println("-".repeat(30));

    }

    public void withdraw(){
        System.out.print("Enter the amount you wish to withdraw : ");
        double amount = scanner.nextDouble();
        scanner.nextLine();

        if (amount < 0){
            System.out.println("Invalid Input");
            System.out.println("-".repeat(30));
            return;
        }

        System.out.print("Enter your secret PIN number : ");
        String usersInputtedPin = scanner.nextLine();

        if( user.getUserPin().equals(usersInputtedPin) ){
            if(amount <= user.getUserBalance()){
                user.setUserNewBalance(-amount);
                System.out.println("...Withdrawal Successful");
            } else{
                System.out.println("Insufficient Funds");
            }
        } else {
            System.out.println("Incorrect Pin");
        }
        System.out.println("-".repeat(30));

    }

    public void checkBalance(){
        System.out.print("Enter your secret PIN number : ");
        String usersInputtedPin = scanner.nextLine();

        if( user.getUserPin().equals(usersInputtedPin) ){
            System.out.printf("%.2f%n" , user.getUserBalance());
        }else {
            System.out.println("Incorrect PIN");
        }

        System.out.println("-".repeat(30));
    }

    public void changePin(){
        System.out.print("Kindly enter your former PIN number : ");
        String userOldPin = scanner.nextLine();

        if(user.getUserPin().equals(userOldPin)){
            System.out.print("Enter your new PIN : ");
            String userNewPin = scanner.nextLine();

            if(userNewPin.length() != 4){
                System.out.println("Your PIN needs to be exactly 4 digits");
            }else {
                user.setUserNewPin(userNewPin);
                System.out.println("PIN updated");
            }
        }else {
            System.out.println("Incorrect PIN");
        }

        System.out.println("-".repeat(30));
    }

}
