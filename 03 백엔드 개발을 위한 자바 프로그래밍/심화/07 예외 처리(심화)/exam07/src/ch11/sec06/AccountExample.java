package ch11.sec06;

public class AccountExample {
    public static void main(String[] args) throws InsufficientException {
        Account account = new  Account();

        account.deposit(10000);
        account.withdraw(5000);
        account.withdraw(7000);
        account.getBalance();

    }
}
