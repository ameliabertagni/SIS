import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class AddingNames {
	
	static Scanner userStringInput = new Scanner(System.in);
	static Scanner userInput = new Scanner(System.in);
	static int addName;
	
	
	public static void main(String[] args) {
		
			chooseAdd();

	}
	
	public static void chooseAdd() {
		System.out.println("Would you like to 1) add a student or 2) delete a student?");
		addName = userInput.nextInt();
		
		if(addName == 1)
			{
				System.out.println("What is the first name of the student you would like to add?");
				students.get(new Student()) ;
				
			}
	
	
	
	}

}
