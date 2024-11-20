public class Product {
    private int prodId;
    private String name;
    private double price;

    public Product(int prodId,String name,double price) {
        this.name=name;
        this.prodId=prodId;
        this.price=price;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getProdId(){
        return this.prodId;
    }
    public void setProdID(int prodId){
        this.prodId=prodId;
    }
    public double getPrice(){
        return this.price;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public void display(){
        System.out.println("The product id      :"+this.prodId);
        System.out.println("The product name    :"+this.name);
        System.out.println("The product price :"+this.price);
        
    }
}
