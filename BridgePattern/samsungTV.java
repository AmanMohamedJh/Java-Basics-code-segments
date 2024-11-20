package BridgePattern;

public class samsungTV implements TV {
	@Override
	public void on() {
		System.out.println("Its on samsung");

	}

	@Override
	public void off() {
		System.out.println("Its off samsung");

	}

	@Override
	public void tune() {
		System.out.println("Its tuning samsung");

	}
}
