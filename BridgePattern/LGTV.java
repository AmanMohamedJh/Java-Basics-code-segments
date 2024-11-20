package BridgePattern;

public class LGTV implements TV {
	@Override
	public void on() {
		System.out.println("Turn ON LGTV");
	}

	@Override
	public void off() {
		System.out.println("Turn off LGTV");

	}

	@Override
	public void tune() {
		System.out.println("Tune the LGTV channels");

	}
}
