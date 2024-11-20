package abstractFactory_singlton;

public class RollsRoyz implements ICar{
//here singlton starts
	
	private static RollsRoyz rolls;
	
	public RollsRoyz() {
		
	}
	
	public static RollsRoyz getInstance() {
		if(rolls == null) {
			rolls = new RollsRoyz();
		}
		return rolls;
	}
	@Override
	public void displayVehical() {
		System.out.println("Rolls royz created");
		
	}

}
