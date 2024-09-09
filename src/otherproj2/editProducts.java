package otherproj2;
import java.util.Scanner;

public class editProducts {
    public void editProduct(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Edit Product Information: \n");
        System.out.print("Enter product ID: ");
        int id = sc.nextInt();
        
        for(int i = 0; i < Array.total; i++){
            if(id == Array.vid.get(i)){
                System.out.println("Selected product: "+Array.vpro.get(i));

                System.out.print("""
                                 1. Product Name
                                 2. Price
                                 Choose what you want to change: """);
                int option = sc.nextInt();

                switch(option){
                    case 1 -> {
                        System.out.print("Enter new product name: ");
                        String product = sc.next();
                        Array.vpro.set(i, product);
                        
                        System.out.println("Product name changed successfully!\n");
                    }
                    case 2 -> {
                        System.out.print("Enter new product price: ");
                        double price = sc.nextDouble();
                        Array.vprice.set(i, price);
                        
                        System.out.println("Product price changed successfully!\n");
                    }
                    default -> { 
                        System.out.println("Invalid option.");
                    }
                }
            }
        }
    }
}
