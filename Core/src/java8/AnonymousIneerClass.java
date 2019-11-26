package java8;

public class AnonymousIneerClass {

	
	
	int x = 888;
	public void m2() {
		
		//This is Anonymous InnerClass below code is comented
		/*Interf i = new Interf() {
			int x = 999;
			public void m1() {
				System.out.println(this.x);
			}
		};*/
		
		Interf i = () -> {int x = 999; System.out.println(this.x);};
		i.m1();
	}
	
	public static void main(String args[]) {
		
		System.out.println("************ Example One **************");
		AnonymousIneerClass ai  = new AnonymousIneerClass(); 
				ai.m2();
		
				System.out.println("************ Example Two **************");
		/*Runnable r = new Runnable() {
			public void run() {
				for(int i=0;i<10;i++) {
					System.out.println("Child Thread");
				}
			}
		};*/
		
		//Above code is anonymous inerclass after lambda expression code is bellow above code is commented
		Runnable r = () -> {for(int i = 0; i<10;i++) {System.out.println("Childeren Thread");}}; 
		Thread t= new Thread(r);
		t.start();
		for(int i = 0 ; i<10; i++) {
			System.out.println("Main Thread");
		}
		
		
		
		
		
		
		
		
	}
}
