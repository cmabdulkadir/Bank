public class Transaction {
    String accountHolder;

    int transactionNumber;

    double purchasePrice; // unmarked attributes == default / accessible within package

    String purchaseName;

    public Transaction(String accountHolder, int transactionNumber, double purchasePrice, String purchaseName) {
        this.accountHolder = accountHolder;
        this.transactionNumber = transactionNumber;
        this.purchasePrice = purchasePrice;
        this.purchaseName = purchaseName;


    }
}
