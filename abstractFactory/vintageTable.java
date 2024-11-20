package abstractFactory;

public class vintageTable implements Vintage {
	@Override
	public void polish() {
		System.out.println("Vintage Table is Polished in low scent");
	}
}
