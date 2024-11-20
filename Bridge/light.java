package Bridge;

public class light implements electronics {
	@Override
	public void on() {
		System.out.println("Turning on : LIGHT");

	}

	@Override
	public void off() {
		System.out.println("Turning OFF : LIGHT");

	}

	@Override
	public void tune() {
		System.out.println("Turning opacity : LIGHT");

	}
}
