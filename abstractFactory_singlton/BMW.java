package abstractFactory_singlton;

public class BMW implements ICar{

	//singlton starts
	
	private static BMW bmw;
	
	public BMW() {
		
	}
	
	public static BMW getInstance() {
		if(bmw == null) {
			bmw = new BMW();
		}
		return bmw;
	}
	
	@Override
	public void displayVehical() {
		System.out.println("displaying Bmw car created");
		
	}

}
