package abstractFactoryExample1;

public class electricCarFactory implements carFactoryInterface {
	@Override
	public Engine createEngine() {  //continue the abstract product by calling Engine and Tire interfaces

		return new electricEngine();
	}

	public Tire createTire() {

		return new electricTire();
	}
}
