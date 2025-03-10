package homework_30.paymentSystem;

public class ElectronicWallet implements PaymentSystem {

    private String accountNumber;
    private double currentBalanceDollars;

    public ElectronicWallet(String accountNumber, double currentBalanceDollars) {
        this.currentBalanceDollars = currentBalanceDollars;
        this.accountNumber = accountNumber;
    }

    @Override
    public void withdrawMoney(double amount) {
        if (currentBalanceDollars < amount) {
            System.out.printf("На вашем счету #%s недостаточно средств. Пополните баланс.\n", accountNumber);
        } else {
            currentBalanceDollars -= amount;
            System.out.printf("Успешная операция. Остаток на счету: %.2f$\n", currentBalanceDollars);
        }

    }

    @Override
    public void depositTransfer(double amount) {
        currentBalanceDollars -= amount * RATE;
        System.out.printf("На счет %s поступило: %.2f€.\n", accountNumber, amount);
        checkBalance();

    }

    @Override
    public void checkBalance() {
        System.out.printf("На вашем счету: %.2f$\n", currentBalanceDollars);

    }

    @Override
    public void transferMoney(PaymentSystem recepient, double amount) {
        if (currentBalanceDollars >= amount) {
            this.withdrawMoney(amount);
            recepient.depositTransfer(amount);
            System.out.println("Успешная операция");
        } else {
            System.out.printf("На вашем счету #%s недостаточно средств. Пополните баланс.\n", accountNumber);
        }

    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getCurrentBalanceDollars() {
        return currentBalanceDollars;
    }

    public void setCurrentBalanceDollars(double currentBalanceDollars) {
        this.currentBalanceDollars = currentBalanceDollars;
    }
}
