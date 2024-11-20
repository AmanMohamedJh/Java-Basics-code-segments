package abstractFactory;

public class chairFactory implements furnitureFactory {
@Override
public Modern createModern() {
	
	return new modernChair();
}
@Override
	public Vintage createVintage() {
		
		return new vintageChair();
	}
}
