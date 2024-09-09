package otherproj2;

public class viewProducts {
    
    int vid;
    String vpro;
    double vprice;
    
    public void processProduct(int idol, String pro, double nice){
        this.vid = idol;
        this.vpro = pro;
        this.vprice = nice;
    }
    
    public void displayProduct(){
           System.out.printf("%-5d %-10s %-10.1f\n",vid,vpro,vprice);
    }
}
