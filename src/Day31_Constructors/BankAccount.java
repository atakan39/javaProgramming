package Day31_Constructors;

public class BankAccount {
    public String accountHolder;
    public long accountNumber;
    public double balance;

    public void setInfo(String accountHolder, long accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;

    }


    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance= $" + balance +
                '}';
    }

    public void checkBalance(){
        System.out.println(accountHolder+", your avaliable balance is: $"+balance);
    }
    public void deposit(double amount){
        if(amount <= 0){
            System.out.println("You can Only deposit more than $0 dollar");
        }
        balance=balance+amount;

    }

    public void withdraw(double amount){
        if(balance<amount){
            System.out.println("insufficient balance for withdraw $"+amount+"\n your balance is "+balance);
            return;
        }
        if(amount <= 0){
            System.out.println("You can Only withdraw more than $0 dollar");
            return;
        }
        balance=balance-amount;



    }
}
/*
BankAccount Task:
        Attributes:
                1. accountHolder, 2. accountNumber, 3. balance

        Actions:
            1. setInfo(): sets the accountHolder and accountNumber attributes
            2. toString()
                3. checkBalance():displays the available balance
                2. deposit(): increases the balance by the given amount
        3. withdraw(): decreases the balance by the given amount


 */