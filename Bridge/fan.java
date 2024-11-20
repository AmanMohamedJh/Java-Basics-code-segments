package Bridge;

public class fan implements electronics {
	@Override
	public void on() {
		System.out.println("Turning on : Fan");

	}

	@Override
	public void off() {
		System.out.println("Turning OFF : Fan");

	}

	@Override
	public void tune() {
		System.out.println("Turning Speed : Fan");

	}
}
