package homework_30.paymentSystem;

public class PaymentApplication {
    public static void main(String[] args) {

        BankAccount accountEuro = new BankAccount("1234567", 3000);
        ElectronicWallet walletDollar = new ElectronicWallet("34584067", 2500);
        BankAccount accountEuro2 = new BankAccount("234563456", 2000);
        ElectronicWallet walletDollar2 = new ElectronicWallet("456456789", 500);

        accountEuro.withdrawMoney(3500);
        walletDollar.checkBalance();
        accountEuro.depositTransfer(1000);
        walletDollar.depositTransfer(500);
        accountEuro.checkBalance();


        accountEuro.transferMoney(accountEuro2, 100);
        accountEuro.transferMoney(walletDollar, 100);
        walletDollar.transferMoney(accountEuro,400);
        walletDollar.transferMoney(walletDollar2, 150);
    }
}
