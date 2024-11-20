package abstractFactory_singlton;

public class TataBus implements IBus{

	private static TataBus tata;
	
	public TataBus() {
		
	}
	public static TataBus getInstance() {
		if(tata == null) {
			tata = new TataBus();
		}
		return tata;
	}
	
	@Override
	public void displayVehical() {
		System.out.println("TataBus has created by display");
		
	}

}
