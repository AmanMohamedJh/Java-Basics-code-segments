package Bridge;

public class RemoteController {
	electronics electro;
	
	public RemoteController(electronics electro) {
		this.electro = electro;
	}
	
	void onButtonPushed() {
		electro.on();
	}
	void offButtonPushed() {
		electro.off();
	}
	void tuneChanges() {
		electro.tune();
	}
}
