package abstractFactory;

public class vintageChair implements Vintage {
	@Override
	public void polish() {
		System.out.println("Vintage chair is Polished in new scent");
	}
}
