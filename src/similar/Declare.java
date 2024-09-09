package similar;

public class Declare {
    
    int p_id;
    String p_name;
    double p_price;
    
    public void processProduct(int id, String name, double price){
        this.p_id = id;
        this.p_name = name;
        this.p_price = price;
    }
    
    public void productRow(){
        System.out.printf("%-5d %-10s %-10.2f\n",p_id,p_name,p_price);
    }
}
