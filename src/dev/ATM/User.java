package dev.ATM;

public class User {

    private String name;
    private Account account ;

    public User(String name){
        this.name = name;
        account = new Account("");
    }

    public String getUserPin(){
       String userPin =  account.getPin();
       return userPin;
    }

    public double getUserBalance(){
        return account.getBalance();
    }
    public void setUserNewBalance(double depositAmount){
        this.account.setNewBalance(depositAmount);
    }

    public void setUserNewPin(String newPin){
        this.account.setPin(newPin);
    }

    @Override
    public String toString() {
        return "User{"+
                "name='" + name + '\'' +
                ", account=" + account +
                '}';
    }
}
