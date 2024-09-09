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
        System.out.println("\nAdd Products: ");
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
        System.out.println("\nProduct List: ");
        System.out.println("---------------------------------------------------------");
        System.out.printf("%-5s %-10s %-10s\n","ID","Product", "Price");
        
        try{
            for(int i = 0; i < max; i++){
            pd[i].productRow();
            }
        }catch(NullPointerException e){
            System.out.println("");
        }
        
        System.out.println("---------------------------------------------------------");
    }
    
    public void editProducts(){
        System.out.println("\nEdit Product:");
        System.out.print("Enter product ID to edit: ");
        id = sc.nextInt();
        
        for(int i = 0; i < max; i++){
            if(id == pd[i].p_id){
                System.out.println("Selected product: "+pd[i].p_name);
                System.out.print("Enter new price: ");
                price = sc.nextDouble();
                
                pd[i].p_price = price;
                
                System.out.println("Price changed successfully!\n");
            }
        }
    }
    
    public void removeProducts(){
        System.out.println("\nRemove Product:");
        System.out.print("Enter product ID: ");
        id = sc.nextInt();
        
        for(int i = 0; i < max; i++){
            System.out.println("Selected product: "+pd[i].p_name);
            System.out.print("Confirm delete? [y/n]: ");
            String confirm = sc.next();
            
            if(confirm.equals("y")){
                pd[i] = null;
            }
        }
    }
}
