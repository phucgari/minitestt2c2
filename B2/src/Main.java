import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Product[] productlist=new Product[5];
        productlist[0]=new Product(1,"ballpoint pen",2000,10,0.1);
        productlist[1]=new Product(2,"pencil",3000,5,0.05);
        productlist[2]=new Product(3,"notebook",10000,7,0.1);
        productlist[3]=new Product(4,"ink pen",20000,3,0.05);
        productlist[4]=new Product(5,"ink",15000,7,0.15);
        double priceBeforeDiscount=0;
        double priceAfterDiscount=0;
        for (int i = 0; i < productlist.length; i++) {
            priceAfterDiscount+=productlist[i].getTotalPriceAfterDiscount();
            priceBeforeDiscount+=productlist[i].getTotalPriceBeforeDiscount();
        }
        System.out.println("Price before discount is "+priceBeforeDiscount);
        System.out.println("Price after discount is "+priceAfterDiscount);
        System.out.println("differences is "+(priceBeforeDiscount-priceAfterDiscount));
    }
}