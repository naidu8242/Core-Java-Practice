package parties;
import java.util.ArrayList;

public class java8Functional {

	interface fun1{
	 int operation(int a, int b);	
	}
	interface fun2{
		void sayMessage(String message);
	}
	private int operate(int a,int b,fun1 fun) {
		return fun.operation(a,b);
	}
	
	public static void main(String[] args) {
		fun1 add = (int x,int y)->x+y;
		fun1 multi = (int x,int y) ->x*y;
		
		java8Functional jf = new java8Functional();
		
		System.out.println("Addition >>"+jf.operate(5, 10, add));
		System.out.println("Multiplication  >>"+jf.operate(5, 10, multi));
		
		fun2 f2 =  message -> System.out.println("Hello"+message);
		f2.sayMessage("funcitonal program is completed");
		
		
		
		
		ArrayList<Integer> ar = new ArrayList();
		ar.add(1);
		ar.add(2);
		ar.add(3);
		ar.add(4);
		ar.add(5);
		ar.add(6);
		
		ar.forEach(a->System.out.println(a));
		
		System.out.println("\n" + "Even numbers");
		ar.forEach(a->{if(a%2==0) System.out.println(a);});
		
	}

}
