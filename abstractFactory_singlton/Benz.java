package abstractFactory_singlton;
//here also you have to use singlton
public class Benz implements ICar{

	//here starts the singlton
	
	private static Benz benz;
	
	public Benz() {
		
	}
	
	public static Benz getInstance() {
		if(benz == null) {
			benz = new Benz(); 
		}
		return benz;
	}
	
	
	@Override
	public void displayVehical() {
		System.out.println("displaying Benz car created");
		
	}

}
