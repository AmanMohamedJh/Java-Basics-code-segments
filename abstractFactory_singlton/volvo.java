package abstractFactory_singlton;

public class volvo implements IBus{

	private static volvo volv;
	
	public volvo() {
		
	}
	public static volvo getInstance() {
		if(volv ==null) {
			volv = new volvo();
		}
		return volv;
	}
	
	@Override
	public void displayVehical() {
		System.out.println("Volvo bus has created by display");
		
	}

}
