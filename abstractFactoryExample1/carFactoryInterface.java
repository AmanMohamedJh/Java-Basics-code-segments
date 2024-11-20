package abstractFactoryExample1;
//this is the abstract factory

public interface carFactoryInterface {
	Engine createEngine();  //while engine and tires are the abstract products
	Tire createTire();		
	
}
