public class ShoppingCart {
 
    public static void main(String[] args) {
        
        Electronics e1= new Electronics(110,"phone", 50000, "samsung", "android");
        Clothing c1=new Clothing(121, "Tshirt", 5000, "adidas", "picee");

        e1.display();
        c1.display();
    }


}
