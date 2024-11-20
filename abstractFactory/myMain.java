package abstractFactory;

public class myMain {

	private Modern modern;
	private Vintage vintage;
	
	public myMain(furnitureFactory factory) {
		this.modern=factory.createModern();
		this.vintage=factory.createVintage();
	}
	
	public void sell() {
		modern.color();
		vintage.polish();
	}
	
	public static void main(String[] args) {
		furnitureFactory chairfact = new chairFactory();
		myMain chair = new myMain(chairfact);
		chair.sell();
		
		furnitureFactory tablefact = new tableFactory();
		myMain table = new myMain(tablefact);
		table.sell();

	}

}
