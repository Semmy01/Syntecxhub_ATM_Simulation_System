package dev.ATM;

public class Account {

    private double balance;
    private String  pin;
    private String accountType;

    public Account(String accountType){
        this.balance = 0;
        this.pin = "0000";
        this.accountType = accountType;
    }

    public double getBalance(){
        return balance;
    }
    public String getPin(){
        return pin;
    }

    public void setNewBalance(double depositedAmount){
        this.balance += depositedAmount;
    }

    public void setPin(String newPIN){
        this.pin = newPIN;
    }


    @Override
    public String toString() {
        return "{"+
                "balance=" + balance +
                ", pin='" + pin + '\'' +
                ", accountType='" + accountType + '\'' +
                '}';
    }
}
