import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Scanner scan = new Scanner(System.in);

        int option = -1;


        do {
            bank.showOption();
            option = scan.nextInt();
            switch (option) {
                case 1:
                    //create new product
                    bank.createTransactions();
                    break;
                case 2:
                    //Print all product
                    bank.readTransactions();
                    break;

                case 3:
                    //update a product
                    bank.updateTransaction();
                    break;
                case 4:
                    //remove a product by name
                    bank.deleteTransaction();
                    break;
                case 5:
                    //Exit
                    System.exit(1);
                    break;
            }

        } while (option != 0);

    }

}
