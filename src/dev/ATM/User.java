package dev.ATM;

public class User {

    private String userName;
    private Account account ;

    public User(String userName){
        this.userName = userName;
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

    public String getUserName(){
        return userName;
    }

    @Override
    public String toString() {
        return "User{"+
                "userName='" + userName + '\'' +
                ", account=" + account +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;

        if(!(obj instanceof User)) return false;

        User user = (User) obj;

        return user.userName.equals(this.userName) ;
    }


}
