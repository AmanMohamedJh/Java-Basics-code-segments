package BridgePattern;

public class myMain {

	public static void main(String[] args) {
		new RemoteController(new LGTV()).onButtonPushed();
		new RemoteController(new LGTV()).tuneChannel();
		new RemoteController(new LGTV()).offButtonPushed(); 
		System.out.println("");
		System.out.println("");
		new RemoteController(new SonyTV()).onButtonPushed();
		new RemoteController(new SonyTV()).tuneChannel();
		new RemoteController(new SonyTV()).offButtonPushed();
		System.out.println("");
		System.out.println("");
		new RemoteController(new samsungTV()).onButtonPushed();
		new RemoteController(new samsungTV()).tuneChannel();
		new RemoteController(new samsungTV()).offButtonPushed();
		
		

	}

}
