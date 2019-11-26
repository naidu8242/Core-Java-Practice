package java8;

@FunctionalInterface
interface Interf
{
	public void m1(); //abstract method
	default void m2(){}
	public static void m3() {}
}	
