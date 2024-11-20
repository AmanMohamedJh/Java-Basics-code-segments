package arrayListss;

class myG<T> {
	T t;
	
	void add(T t) {
		this.t=t;
	} 
	public T getValue() {
		return this.t=t;
	}
}


public class MyGen {
	public static void main(String[]args) {
		
		myG<String> stringG = new myG();
		
		stringG.add("aaaa");
		stringG.add("bbbb");
		stringG.add("cccc");
		
		System.out.println(stringG.getValue());
		
		
		myG<Integer> intG = new myG();
		
		intG.add(10);
		intG.add(20);
		intG.add(30);
		
		System.out.println(intG.getValue());

	}
}
