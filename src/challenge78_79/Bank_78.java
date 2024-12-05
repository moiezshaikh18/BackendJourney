package challenge78_79;

public class Bank_78 {

    private double acc_number;
    private String acc_holder_name;
    private double balance;

    public Bank_78(double acc_number, String acc_holder_name) {
        this.acc_number = acc_number;
        this.acc_holder_name = acc_holder_name;

    }

    public void deposit(double balance){
        System.out.println(this.balance += balance);
    }

    public void withdraw(double balance){
        if(this.balance < balance){
            System.out.println("insufficient balance!!!!");
        }
        System.out.println(this.balance -= balance);
    }

    public static void main(String[] args) {
        Bank_78 bank78 = new Bank_78(001.00,"Moiz");
        bank78.deposit(1000);
        bank78.withdraw(200);
        bank78.deposit(100);
        bank78.withdraw(1200);
    }
}
