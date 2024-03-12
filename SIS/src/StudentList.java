import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentList 
	{
		ArrayList<Student> students = new ArrayList<Student>();
		
		public void fileRead() throws IOException
			{
				Scanner studentFile = new Scanner(new File("studentData.txt"));
				while(studentFile.hasNextLine()) {
					String line = studentFile.nextLine();
					String[] section = line.split(" ");
					
					String firstname = section[0];
					String lastName = section[1];
					int algGrade = changeGrade(section[3]);
					int engGrade = changeGrade(section[5]);
					int chemGrade = changeGrade(section[7]);
					double gpa = (algGrade + engGrade + chemGrade) / 3.0;
					
					Student student = new Student(firstname, lastName, gpa, algGrade, engGrade, chemGrade);
					students.add(student);
				
				}
				
			}
		private int changeGrade(String section) {
			int gradeValue = switch (section.charAt(0)) {
				case 'A' -> 4;
				case 'B' -> 3;
				case 'C' -> 2;
				case 'D' -> 1;
				default -> 0;
			};
			
			return gradeValue;
		}
//This method is used to access the ArrayList for display menus etc.
		public ArrayList<Student> getStudents() {
			return students;
		}
	}
