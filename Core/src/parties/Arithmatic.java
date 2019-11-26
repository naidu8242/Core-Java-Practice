package parties;
public class Arithmatic {
	public void add(int x, int y) {
		int k = 0;
		while(y!=0){
			k = x & y;
			x = x ^ y;
			y = k << 1;
		}
		System.out.println("Added Value: "+x);
	}

	public void subtract(int x, int y) {
		int k = 0;
		while(y!=0){
		k = ~x & y;
		x = x ^ y;
		y = k << 1;
		}
		System.out.println("Subtracted Value: "+x);	
	}
	public void multiply(int x, int y){
		int k = 0;
		for(int i=0; i<x; i++){
			k = k + y;
		}
		System.out.println("Multiplied Value: "+k);
	}
	
	public void divide(int x, int y){
		int k = 0;
		while(x >=y){
			x = x - y;
			k++;
		}
		System.out.println("Divided Value: "+k);
	}
	
	public static void main(String args[]) {
		Arithmatic am = new Arithmatic();
		am.add(20, 5);
		am.subtract(50, 10);
		am.multiply(20,5);
		am.divide(10, 5);
	}
}
