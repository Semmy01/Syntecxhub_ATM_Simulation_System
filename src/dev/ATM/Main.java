package dev.ATM;

public class Main {
    public static void main(String... args){
        User user1 = new User("Ben");
        ATM atm = new ATM();
        atm.setUser(user1);
        Utility.displayOptions(atm);








    }
}
