package BridgePattern;
	
public class RemoteController {
	TV tv ;
	
	public RemoteController(TV tv) {
		this.tv=tv;                    //same remote will be used for both tv models
	}
	
	void onButtonPushed() {
		tv.on();
	}
	void offButtonPushed() {
		tv.off();
	}
	void tuneChannel() {
		tv.tune();
	}
}
