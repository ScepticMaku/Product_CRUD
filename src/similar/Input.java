package similar;
import java.util.Scanner;

public class Input {
    Scanner sc = new Scanner(System.in);
    Declare[] pd = new Declare[100];
    public static int max = 0;
    
    int id;
    String product;
    double price;
    
    public void addProducts(){
        
        System.out.print("Enter number of products to add: ");
        int num = sc.nextInt();
        
        for(int i = 0; i < num; i++){
            System.out.println("Enter details of product ID "+(i+1)+": ");
            System.out.print("ID: ");
            id = sc.nextInt();
            System.out.print("Name: ");
            product = sc.next();
            System.out.print("Price: ");
            price = sc.nextDouble();
            
            pd[i] = new Declare();
            pd[i].processProduct(id, product, price);
        }
        
        max += num;
    }
    
    public void viewProducts(){
        System.out.println("Product List: ");
        System.out.println("---------------------------------------------------------");
        System.out.printf("%-5s %-10s %-10s\n","ID","Product", "Price");
        
        for(int i = 0; i < max; i++){
            pd[i].productRow();
        }
        
        System.out.println("---------------------------------------------------------");
    }
    
    public void editProducts(){
        System.out.println("Edit Product: \n");
        System.out.print("Enter product ID to edit: ");
        id = sc.nextInt();
        
        System.out.println("Selected product: "+pd[id].p_name);
    }
}
