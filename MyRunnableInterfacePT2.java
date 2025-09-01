package JavaThreadClass;// project created in eclipse

public class MyRunnableInterfacePT2 implements Runnable {// public class created 'MyRunnableInterfacePT2'
//which implements from the interface 'Runnable'
	
	public void run() { // method created
		System.out.println("Code running inside thread"); // display text
	}

	public static void main(String[] args) {// reads, run and executes code
		
// created object of the 'MyRunnableInterfacePT2' class, object called 'myNewThread'
		MyRunnableInterfacePT2 myNewThread = new MyRunnableInterfacePT2(); 
		
		Thread myThread = new Thread(myNewThread); // created object of thread class 'myThread'
// which takes data from object 'myNewThread' in the 'MyRunnableInterfacePT2'
		
		myThread.start(); // the thread begins executions of code
		
		System.out.println("Code running outside thread"); // displays text
		
		

	}

}
// result: 
//Code running outside thread
//Code running inside thread