import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class ReadingTxtFile 
{
	public ArrayList<Student> studentData = new ArrayList<Student>();
	public static void fillArrayList() throws IOException
	{
		Scanner myFile = new Scanner(new File(“studentData.txt”));
		while(myFile.hasNext())
		{
			String firstName = myfile.next();
			String lastName = myfile.next();
			double GPA = 0;
			String period1 = myfile.next();
			String period2 = myfile.next();
			String period3 = myfile.next();
			String period4 = myfile.next();
			String period5 = myfile.next();
			
			studentData.add(new Student(firstName, lastName, GPA, period1, period2, period3, period4, period5));
		}
	}
}
