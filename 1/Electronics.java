public class Electronics extends Product {
    private String brand;
    private String model;

    Electronics(int prodId,String name,double price,String brand , String model) {
       super(prodId,name,price);
       this.brand=brand;
       this.model=model;
    }
    public void display(){
        super.display();
        System.out.println("The product brand :"+this.brand);
        System.out.println("The product model :"+this.model);
    }
    
}
