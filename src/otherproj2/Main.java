package otherproj2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        viewProducts vp = new viewProducts();
        addProducts ap = new addProducts();
        editProducts ep = new editProducts();
        removeProducts rp = new removeProducts();
        Scanner sc = new Scanner(System.in);
        String transaction;
  
        do{
            System.out.print("""
                            Product CRUD

                             1. Add Products
                             2. View Products
                             3. Edit Products
                             4. Remove Products
                             Enter choice: """);
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    ap.addProduct();
                    break;
                case 2:
                    vp.displayProduct();
                    break;
                case 3:
                    ep.editProduct();
                    break;
                case 4:
                    rp.removeProduct();
                    break;
                default:
                    System.out.println("Invalid choice.\n");
            }
            System.out.print("Create another transaction? (yes/no): ");
            transaction = sc.next();
        } while(transaction.contains("y"));
    }
}
