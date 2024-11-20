package Bridge;

public class myMain {

	public static void main(String[] args) {
		System.out.println("Fan controllers ");
		System.out.println();
		new RemoteController(new fan()).onButtonPushed();
		new RemoteController(new fan()).tuneChanges();
		new RemoteController(new fan()).offButtonPushed();
		System.out.println();
		System.out.println("Light controllers");
		System.out.println();
		new RemoteController(new light()).onButtonPushed();
		new RemoteController(new light()).tuneChanges();
		new RemoteController(new light()).offButtonPushed();
		System.out.println();
		System.out.println("AC controllers");
		System.out.println();
		new RemoteController(new AC()).onButtonPushed();
		new RemoteController(new AC()).tuneChanges();
		new RemoteController(new AC()).offButtonPushed();
		
	}

}

