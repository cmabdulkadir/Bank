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

}
