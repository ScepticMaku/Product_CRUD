package otherproj2;

public class viewProducts {
    public void displayProduct(){
            System.out.print("Display Products: \n");
            
            System.out.printf("\n%-5s %-10s %-10s\n","ID","Product","Price");
            
            for(int i = 0; i < Array.total; i++){
                System.out.printf("%-5d %-10s %-10.1f\n",Array.vid.get(i),Array.vpro.get(i),Array.vprice.get(i));
            }
    }
}
