package parties;

class Container<T extends Number> {
	T value;
	
	public void show() {
		System.out.println(value.getClass().getName());
		
	}
}

public class genericsDemo {

	public static void main (String args[]) {
		Container<Double> cont = new Container<>();
		cont.value = 120.55;
		cont.show();
	}
}
