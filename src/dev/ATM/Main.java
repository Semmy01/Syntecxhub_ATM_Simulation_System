package dev.ATM;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String... args){

        Scanner scanner = new Scanner(System.in);
        ATM atm = new ATM();

        ArrayList<User> users = new ArrayList<>();
        User user1 = new User("Ben");
        User user2 = new User("Oluku-Biscuit");
        User user3 = new User("OG-Waheed");
        User user4 = new User("Retired");

        users.add(user1); users.add(user2); users.add(user3); users.add(user4);

        User mainUser;

        do {
            System.out.print("Enter your Username : ");
            String userName =  scanner.nextLine().trim();
            mainUser = new User(userName);

            if(users.contains(mainUser)){
                atm.setUser(mainUser);
                Utility.greetings(mainUser);
                Utility.displayOptions(atm);
            }else{
                System.out.println("User does not exist");
            }
        }while (users.contains(mainUser));

    }
}
