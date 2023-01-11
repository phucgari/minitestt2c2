public class Product {
    private int id;
    private String name;
    private double price;
    private int number;
    private double discount;
    public Product(int id,String name,double price,int number,double discount){
        this.id=id;
        this.name=name;
        this.price=price;
        this.number=number;
        this.discount=discount;
    }

    public int getId() {
        return id;
    }

    public double getDiscount() {
        return discount;
    }

    public double getPrice() {
        return price;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public double getTotalPriceAfterDiscount(){
        return price*(1-discount)*number;
    }

    public double getTotalPriceBeforeDiscount() {
        return price*number;
    }
}
