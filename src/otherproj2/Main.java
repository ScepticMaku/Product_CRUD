package otherproj2;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        addProducts ap = new addProducts();
        Scanner sc = new Scanner(System.in);
        String transaction;
  
    do{
        System.out.print("""
                        Product CRUD

                         1. Add Products
                         2. View Products
                         Enter choice: """);
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                    ap.addProduct();
                break;
            case 2:
                viewProducts[] products = ap.getProducts();
                
                System.out.printf("\n%-5s %-10s %-10s\n","ID","Product","Price");
                for(int i = 0;i < ap.pnum; i++){
                    if(products[i] != null){
                        products[i].displayProduct();
                    }
            }
                break;
        }
        System.out.print("Create another transaction? (yes/no): ");
        transaction = sc.next();
    } while(transaction.equals("yes"));
 
    }
}
