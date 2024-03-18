import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class AddClass {
	
	public static StudentList studentList = new StudentList();
	
	public static void main(String[] args)
	{
		addorDelete();
			Scanner myList = new Scanner(new File("studentData.txt"));

	}
	
	public static void addorDelete() 
		{
		Scanner scanner = new Scanner(System.in);
		System.out.println("do you want to add or delete a student?");
		String option = scanner.nextLine();
		
		if(option.equals("add"))
			{
			addStudent(scanner);
			}
		else if(option.equals("delete"))
			{
				deleteStudent(scanner);
			}
		else 
			{
				System.out.println("Invalid option");
				addorDelete();
			}
		}
		public static void addStudent(Scanner scanner)
		{
			System.out.println("enter the students details in order: firstName, lastName, gpa, algebra grade, english grade, and chemistry grade");
			String line = scanner.nextLine();
			
			String[] placement = line.split(" ");
			
			if(placement.length !=6) {
				System.out.println("Invalid number of answers...are you forgetting any details?");
			}
			String firstName = placement[0];
			String lastName = placement[1];
			double gpa = Double.parseDouble(placement[2]);
			int algGrade = Integer.parseInt(placement[3]);
			int engGrade = Integer.parseInt(placement[4]);
			int chemGrade = Integer.parseInt(placement[5]);
		}
		
		public static void deleteStudent(Scanner scanner)
		{
			
		}
		}
	
	
