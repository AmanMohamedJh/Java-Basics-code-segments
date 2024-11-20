package BridgePattern;

public class SonyTV implements TV {
	@Override
	public void on() {
		System.out.println("Turn ON Sony TV");
	}

	@Override
	public void off() {
		System.out.println("Turn off Sony TV");
	}

	@Override
	public void tune() {
		System.out.println("Tune the Sony TV channels");
	}
}
