package Multithreading;
class MultithreadingDemo implements Runnable 
{ 
    public void run() 
    { 
        try
        { 
            // Displaying the thread that is running 
            System.out.println ("Thread " + 
                  Thread.currentThread().getId() + 
                  " is running"); 
  
        } 
        catch (Exception e) 
        { 
            // Throwing an exception 
            System.out.println ("Exception is caught"); 
        } 
    } 
} 
  
// Main Class 
public class Multithread 
{ 
    public static void main(String[] args) 
    { 
//        int n = 8; // Number of threads 
        for (int i=0; i<8; i++) 
        { 
        	Thread thread = new Thread(new MultithreadingDemo());
            thread.start(); 
        } 
    } 
} 