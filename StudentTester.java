package calculateResult;

import java.util.Scanner;
//Author- Mohd Ismail Farooq Lakhani 
public class StudentTester {
	public static void main(String[] args)

	{

	Scanner input =new Scanner(System.in);//declaration of scanner object

	System.out.println("This program gives the average marks and "+" \nresult of the student in the performed test ");
	
	int choice =0 ,numberOfStudents=0;//Initialize values

	System.out.println("\nKindly enter the number of students ");

	numberOfStudents=input.nextInt();

	input.nextLine();

	Student[]student = new Student[numberOfStudents];

	for(int i=0;i<numberOfStudents;i++)

	{

	/*

	* Do while loop is used to ensure that all statements are printed atleast once

	* and choice is received irrespective of any choice of user .

	* Once user enters the value based on the value,

	* switch case is used and functions are called.

	*/

	System.out.print("Select the course of the " + (i +1) + " student");

	
	System.out.println("\n1.UnderGraduate");

	System.out.println("2.PostGraduate");

	

	choice = input.nextInt();// receives choice from user as input

	input.nextLine();

	/*below switch is used to execute particular statements based on choice

	*if 1 , it executes one. if 2, it executes 2 and so on .break is used to break the loop

	*if breaks is not used , executes all cases below the mentioned value

	*/

	switch (choice)

	{

	case 1: //when choice is 1, below statements are executed

	student[i]= new UnderGraduate();

	System.out.print("\nEnter name of the student " );

	student[i].setName(input.nextLine());;

	System.out.print("\nEnter student ID of the student ");

	student[i].setId(input.nextLong());

	break;//break the loops

	case 2://when choice is 1, below statements are executed

	System.out.print("Enter name of the student ");

	String name = input.nextLine();

	System.out.print("Enter id of student ");

	long id = input.nextLong();

	student[i]= new PostGraduate(name,id);

	break;//break the loops

	default://when other choices are given , below statements are

	System.out.println("Please enter the appropriate value:");

	break;//break the loops

	}

	for (int j=0;j<student[i].getNumTests();j++)

	{

	System.out.print("Enter the marks of " + student[i].getName() + " in  paper " + (j +1) );

	input.nextLine();

	int score = input.nextInt();

	student[i].setTestScore(j, score);

	}

	}

	for (int i=0;i<numberOfStudents;i++)

	{

	student[i].calculateResult();

	System.out.println(student[i].toString());

	}

	input.close();//closes the scanner input object

	}//end of main method()
}