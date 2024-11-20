package abstractFactory;

public class tableFactory implements furnitureFactory {
	@Override
	public Modern createModern() {
		return new modernTable();
	}
	@Override
	public Vintage createVintage() { 
		return new vintageTable();
	}
}
