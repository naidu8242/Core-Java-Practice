package parties;

public class RecursionExample4 {
/*	static int n1=0,n2=1,n3=0;      
    static void printFibo(int count){      
       if(count>0){      
            n3 = n1 + n2;      
            n1 = n2;      
            n2 = n3;      
            System.out.print(" "+n3);     
            printFibo(count-1);      
        }      
    }        
 
public static void main(String[] args) {  
   int count=5;      
     System.out.print(n1+" "+n2);//printing 0 and 1      
     printFibo(count-2);//n-2 because 2 numbers are already printed     
}  */

static int factorial(int n){      
    if (n == 1)      
      return 1;      
    else      
      return(n * factorial(n-1));      
}      

public static void main(String[] args) {  
	double a = 14;
	double b = 3;
	
	double x = b/a;
	System.out.println(x);
System.out.println("Factorial of 5 is: "+factorial(5));  
}  


}
