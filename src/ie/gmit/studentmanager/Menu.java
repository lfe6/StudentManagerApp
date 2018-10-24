package ie.gmit.studentmanager;

import java.util.*; //need for scanner

public class Menu {

	private Scanner userInput;
	private StudentManager sm;
	private boolean keepRunning = true;
	
	public void start() {
		//create new scanner object in take input from the user
		userInput= new Scanner(System.in);
		sm= new StudentManager();
		
		while(keepRunning) {
			//showOptions();
			System.out.println("(1) add student");
			System.out.println("(2) delete student");
			System.out.println("(3) search student by Id");
			System.out.println("(4) search student by first name");
			System.out.println("(5) show total number of students");
			System.out.println("(6) quit");
			System.out.println("pick a number between 1 and 6");
			
			//convert user
			int userMenuOption = userInput.nextInt();
		}
	}
}
