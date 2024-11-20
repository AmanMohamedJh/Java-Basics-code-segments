package abstractFactory_singlton;

public class busFactory implements VehicalFactory {
	
	private static busFactory busfac;
	
	public busFactory() {
		
	}
	
	public static busFactory getInstance() {
		if(busfac == null) {
			busfac = new busFactory();
		}
		return busfac;
	}
	
	@Override
	public Object getModel(String type) {
		if(type.equalsIgnoreCase("VOLVO")) {
			return volvo.getInstance();
		}
		else if(type.equalsIgnoreCase("FUSOBUS")){
			return fusoBus.getInstance();
		}
		else if(type.equalsIgnoreCase("TATABUS")) {
			return TataBus.getInstance();
		}
		else {
			return null;
		}
		
	}
}
