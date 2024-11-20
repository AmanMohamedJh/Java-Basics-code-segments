package Bridge;

public class AC implements electronics {
	@Override
	public void on() {
		System.out.println("Turning on : AC");

	}

	@Override
	public void off() {
		System.out.println("Turning OFF : AC");

	}

	@Override
	public void tune() {
		System.out.println("Turning temperature : AC");

	}
}
