public class Clothing extends Product {
    private String size;
    private String color;

	Clothing(int prodId, String name, double price,String size,String color) {
		super(prodId, name, price);
		this.size=size;
		this.color=color;
	}
    public void display(){
        super.display();
        System.out.println("The product brand :"+this.size);
        System.out.println("The product model :"+this.color);
    }


    
}
