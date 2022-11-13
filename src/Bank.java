import java.util.HashMap;
import java.util.Scanner;


public class Bank {
    private Scanner scan = new Scanner(System.in);

    HashMap<Integer, Transaction> transactions;

    public Bank() {

        this.transactions = new HashMap<Integer, Transaction>();
    }

}
