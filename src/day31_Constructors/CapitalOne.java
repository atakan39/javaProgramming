package day31_Constructors;

public class CapitalOne {
    public static void main(String[] args) {

        BankAccount account1=new BankAccount();
        account1.setInfo("Atakan Taskin",96128960);

        BankAccount account2=new BankAccount();
        account2.setInfo("Emre Yilmaz",96128975);

        BankAccount account3=new BankAccount();
        account3.setInfo("Sidar Selmanli",96128993);


account1.deposit(1000);
account1.checkBalance();

account1.withdraw(1100);





    }
}
