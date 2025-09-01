package JavaThreadClass; // project created in eclipse

public class MyRunnableInterface implements Runnable { // created class 'MyRunnableInterface'
// that implements from the interface 'Runnable'
	public void run() { // method made
		System.out.println("This is running in the thread"); // displays text
	}
	public static void main(String[] args) { // reads,runs & executes
		MyRunnableInterface myThread = new MyRunnableInterface(); // created an object of the class
//'MyRunnableInterface' object named 'myThread'
		
		myThread.run(); // object calls onto the method to run code

	}

}

// Result:
// This is running in the thread