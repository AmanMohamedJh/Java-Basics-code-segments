package abstractFactoryExample1;

public class gasCarFactory implements carFactoryInterface {

	@Override
	public Engine createEngine() {

		return new gasEngine();
	}

	public Tire createTire() {

		return new gasTire();
	}
}
