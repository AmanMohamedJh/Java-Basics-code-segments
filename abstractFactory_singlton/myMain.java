package abstractFactory_singlton;

public class myMain {

	public static void main(String[] args) {
		ICar car1 = (ICar) VehicalProducer.getVehical("CAR").getModel("BMW");
		car1.displayVehical();
		
		IBus bus1 = (IBus) VehicalProducer.getVehical("BUS").getModel("VOLVO");
		bus1.displayVehical();
	}

}
