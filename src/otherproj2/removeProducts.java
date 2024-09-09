package otherproj2;
import java.util.*;

public class removeProducts {
    public void removeProduct(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Remove product: \n");
        
        System.out.print("Enter product ID you want to remove: ");
        int id = sc.nextInt();
        
        for(int i = 0; i < Array.total; i++){
            if(id == Array.vid.get(i)){
                System.out.println("Selected product: "+Array.vpro.get(i));
                System.out.print("Confirm deletion? (yes/no): ");
                String confirm = sc.next();
                
                if(confirm.equals("yes")){
                    Array.vpro.remove(i);
                    Array.vid.remove(i);
                    Array.vprice.remove(i);
                    
                    System.out.println("Product successfully deleted!\n");
                } else{
                    System.out.println("Deletion cancelled\n");
                }
            }
        }
    }
}
