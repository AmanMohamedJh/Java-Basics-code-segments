package abstractFactory_singlton;

public class carFactory implements VehicalFactory {
	
	//here is the singlton used in carfactory starts
	private static carFactory carFact;
	
	public carFactory() {
		
	}
	
	public static carFactory getInstance() {
		if(carFact==null) {
			carFact = new carFactory();
		}
		return carFact;
	}
	//here the singlton ends in carfactory class
	
	@Override
	public Object getModel(String type) {
		if(type.equalsIgnoreCase("BMW")) {
			return BMW.getInstance();
		}
		else if(type.equalsIgnoreCase("BENZ")) {
			return Benz.getInstance();
		}
		else if(type.equalsIgnoreCase("ROLLSROYZ")) {
			return RollsRoyz.getInstance();
		}
		else {
			return null;
		}
		
		
	}
}
