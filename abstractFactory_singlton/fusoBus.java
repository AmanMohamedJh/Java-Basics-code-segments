package abstractFactory_singlton;

public class fusoBus implements IBus {
	private static fusoBus fuso;
	
	public fusoBus() {
		
	}
	
	public static fusoBus getInstance() {
		if(fuso==null) {
			fuso = new fusoBus();
		}
		return fuso;
	}
	@Override
	public void displayVehical() {
		System.out.println("Fuso bus has created by display");
		
	}

}
