package similar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Input in = new Input();
        
        String transaction;
        
        System.out.println("Product CRUD System\n");
        
        do{
            System.out.printf("""
                             1. Add Products
                             2. View Products
                             3. Edit Products
                             4. Remove Products
                             Enter selection: """);
            int select = sc.nextInt();

            switch(select){
                case 1 -> in.addProducts();
                case 2 -> in.viewProducts();
                case 3 -> in.editProducts();
                case 4 -> in.removeProducts();
                default -> System.out.println("Invalid choice.");
            }
            System.out.print("Make another transaction? (y/n): ");
            transaction = sc.next();
        } while(transaction.contains("y"));
        
    }
}
