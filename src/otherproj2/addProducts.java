package otherproj2;
import java.util.*;

public class addProducts {
    public Array ar;
    int pnum;
    
    public void addProduct(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Add Product Info: \n");
        
        System.out.print("Enter number of products to add: ");
        pnum = sc.nextInt();
        
        for (int i = 0; i < pnum; i++ ){
            System.out.println("\nEnter Details of Product: " + (i+1));
            System.out.print("Enter Product Name: ");
            String prod = sc.next();
            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            System.out.print("Enter Price: ");
            double price = sc.nextDouble();
            
            Array.vpro.add(prod);
            Array.vid.add(id);
            Array.vprice.add(price);
        }
        
        Array.total+=pnum;
    }
}
