package logicalPrograms;

public class FinalizeExample {
	public void finalize() {
		System.out.println("finalize is calling");
	}

	public static void main(String[] args) {

		FinalizeExample fe = new FinalizeExample();
		FinalizeExample fe1 = new FinalizeExample();
		fe = null;
		fe1 = null;
		System.gc();
		
		String s = "abc";
		s = s + 1 +2 ;
		s = s + (2+2);
		s.concat("1").concat("2");
		s.concat(""+2+2);
		System.out.println(s);
	}

}
