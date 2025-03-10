package homework_30.paymentSystem;

public class BankAccount implements PaymentSystem {

    private String accountNumber;
    private double currentBalanceEuro;

    public BankAccount(String accountNumber, double currentBalanceEuro) {
        this.currentBalanceEuro = currentBalanceEuro;
        this.accountNumber = accountNumber;
    }

    @Override
    public void withdrawMoney(double amount) {
        if (currentBalanceEuro < amount) {
            System.out.printf("На вашем счету #%s недостаточно средств. Пополните баланс.\n", accountNumber);
        } else {
            currentBalanceEuro -= amount;
            System.out.printf("Успешная операция. Остаток на счету: %.2f€\n", currentBalanceEuro);
        }

    }

    @Override
    public void depositTransfer(double amount) {

        currentBalanceEuro -= amount / RATE;
        System.out.printf("На счет %s поступило: %.2f$\n", accountNumber, amount);
        checkBalance();
    }

    @Override
    public void checkBalance() {
        System.out.printf("Ваш баланс: %.2f€\n", currentBalanceEuro);

    }

    @Override
    public void transferMoney(PaymentSystem recepient, double amount) {
        if (currentBalanceEuro >= amount) {
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

    public double getCurrentBalanceEuro() {
        return currentBalanceEuro;
    }

    public void setCurrentBalanceEuro(double currentBalanceEuro) {
        this.currentBalanceEuro = currentBalanceEuro;
    }
}
