import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Amelia 
{
	static Scanner userStringInput = new Scanner(System.in);
	static Scanner userInput = new Scanner(System.in);
	static int sortPick;
	
	public static void main(String[] args)
	{
		chooseSort();
	}
	
	public static void chooseSort()
	{
		System.out.println("How would you like to sort the student database? \n   1. By last name.\n   2. By GPA.\n   3. By period.");
		sortPick = userInput.nextInt();
		if(sortPick == 1)
		{
			lastName();
		}
		else if(sortPick == 2)
		{
			gPA();
		}
		else if(sortPick == 3)
		{
			period();
		}
		else
		{
			System.out.println("Sorry, that choice was not one of our options. We will let you select a new choice.");
			chooseSort();
		}
	}
	
	public static void lastName()
	{
		
	}
	
	public static void gPA()
	{
		
	}
	
	public static void period()
	{
		
	}
}

