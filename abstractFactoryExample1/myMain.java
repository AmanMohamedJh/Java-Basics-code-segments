package abstractFactoryExample1;

public class myMain {

	private Engine engine; 
	private Tire tire;
	
	public myMain(carFactoryInterface factory){
		this.engine = factory.createEngine();
		this.tire = factory.createTire();
	}
	public void drive() {
		engine.start();
		tire.roll();
	}
	
	
	public static void main(String[] args) {
		carFactoryInterface elecCarFac = new electricCarFactory();
		myMain electricCar = new myMain(elecCarFac);
		electricCar.drive();
		
		carFactoryInterface gasCarFac = new gasCarFactory();
		myMain GasCar = new myMain(gasCarFac);
		GasCar.drive();
		
		
	}

}
