package dont;

public class MyMain {

	public static void main(String[] args) {
		Animal.Dog = new Dog();
		Dog dog = new Dog();
		dog.eat();
		Dog dog2 = new Dog();
		
		dog2.makeSound();
		
		Animal.Cat = new Cat();
		Cat cat = new Cat();
		cat.eat();
		Cat cat2 = new Cat();
		cat2.makeSound();

	}

}
