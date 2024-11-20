package abstractFactory_singlton;

public class VehicalProducer {
	public static VehicalFactory getVehical(String type) {
		
		if(type.equalsIgnoreCase("CAR")) {
			return carFactory.getInstance();
		}
		else if(type.equalsIgnoreCase("BUS")) {
			return busFactory.getInstance();
		}
		else {
			return null;
		}
		
	}
}
