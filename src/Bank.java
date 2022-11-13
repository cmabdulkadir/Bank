import java.util.HashMap;
import java.util.Scanner;


public class Bank {
    private Scanner scan = new Scanner(System.in);

    HashMap<Integer, Transaction> transactions;

    public Bank() {

        this.transactions = new HashMap<Integer, Transaction>();
    }

    public void showOption() {
        System.out.println("\nType (1) to create a new Transaction");
        System.out.println("Type (2) to read all Transaction");
        System.out.println("Type (3) to update a Transaction");
        System.out.println("Type (4) to delete a Transaction ");
        System.out.println("Type (5) to Exit");
    }

    public void createTransactions() {
        System.out.println("Enter the ID number:");
        int idNum = Integer.parseInt(scan.nextLine());
        System.out.println("Enter account holder name:");
        String accountHolder = scan.nextLine();
        System.out.println("Enter the the transaction number:");
        int transactionNumber = Integer.parseInt(scan.nextLine());
        System.out.println("Enter the purchase name:");
        String purchaseName = scan.nextLine();
        System.out.println("Enter the purchase price:");
        double purchasePrice = Double.parseDouble(scan.nextLine());
        transactions.put(idNum, new Transaction(accountHolder, transactionNumber, purchasePrice, purchaseName));
        //System.out.println(transactions);
        readTransactions();
    }

    public void readTransactions() {

        for (Integer key : transactions.keySet()) {         //printing all values
            System.out.print("Key: " + key + " Values: " + transactions.get(key));
            //printing all values
        }

    }
    public void updateTransaction(){
        this.readTransactions();
        System.out.println("What is the iD of the transaction you want to update");
        int id = Integer.parseInt(scan.nextLine());
        transactions.get(id);

        System.out.println("Enter account holder name:");
        String accountHolder = scan.nextLine();
        System.out.println("Enter the the transaction number:");
        int transactionNumber = Integer.parseInt(scan.nextLine());
        System.out.println("Enter the purchase name:");
        String purchaseName = scan.nextLine();
        System.out.println("Enter the purchase price:");
        double purchasePrice = Double.parseDouble(scan.nextLine());

        transactions.put(id, transactions.get(id));
        transactions.put(id ,new Transaction(accountHolder, transactionNumber, purchasePrice, purchaseName));
    }
    public void deleteTransaction (){
        this.readTransactions();
        System.out.println("What is the iD of the transaction you want to delete:");
        Integer id = Integer.parseInt(scan.nextLine());
        transactions.remove(id);
        System.out.println("---TRANSACTION DELETED---");
        System.out.println(transactions);
    }
}