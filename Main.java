package JavaThreadClass; // project created in eclipse

public class Main extends Thread { // created public class 'Main' which uses inheritance, to run data from 'Thread' class
	public void run() {// created method 'run'
		System.out.println("The code is still running in a thread"); // display text
	}

	public static void main(String[] args) {// reads, runs & executes code
		Main myMain = new Main(); // created object myMain
		
		myMain.start();// ran code in the method, through the extended Thread class
		
		//myMain.run();// got object to call on method and run code

	}

}

//Result: The code is still running in a thread