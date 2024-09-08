package otherproj2;
import java.util.Scanner;

public class addProducts {
    
    int pnum;
    viewProducts[] vp = new viewProducts[100];
    
    public int getPnum(){
        return pnum;
    }
    
    public viewProducts[] getProducts(){
        return vp;
    }
    
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
            
            vp[i] = new viewProducts();
            vp[i].processProduct(id,prod,price);
        }
    }
}
