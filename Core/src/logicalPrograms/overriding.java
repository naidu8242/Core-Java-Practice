package logicalPrograms;

class Animal{
	int i = 10;
	void sound() {
		System.out.println("Nothning");
	}
}

class Dog extends Animal{
	int i = 12;
	void sound() {
		System.out.println("meoo");
	}
}
public class overriding {
	public static void main(String[] args) {
		Animal an = new Dog();
		an.sound();
		System.out.println(an.i);
	}
}
