package JavaThreadClass; // project made in eclipse

public class BasicThread extends Thread {// created public class 'BasicThread' extends 'Thread'

	public static void main(String[] args) {// reads, run & executes
		BasicThread myOuterThread = new BasicThread(); // created object of class 'myOuterThread'
		
		myOuterThread.start(); // executes thread
		
		System.out.println("This is running outside the Thread"); // display text

	}
 public void run() {
	 System.out.println("This is running inside the thread"); // 'myOuterThread.start()' runs the code
// in the method run(), which displays a text
 }
}

//Result:
//This is running outside the Thread
//This is running inside the thread