import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {

        // SHOPPING CART PROGRAM

        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.println("What item would you like to buy?: ");
        item = scanner.nextLine();

        scanner.close();
    }
}
