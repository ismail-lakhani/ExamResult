package calculateResult;

public abstract class Student {
	
//Author- Mohd Ismail Farooq Lakhani 
	// The below variables are hided using access qualifiers (private)

	private String name;

	private long id ;

	private String grade;

	private int[] test;

	private final static int NUM_TESTS =3 ;

	// Default constructor is created ,if not java will create a default one

	public Student() {

	this.name="undefined";

	this.id=0;

	this.grade="undefined";

	this.test = new int[NUM_TESTS];

	}

	// Another constructor is created with overloading of constructor

	public Student(String name, long id )

	{

	this.name = name;

	this.id = id;

	test = new int[NUM_TESTS];

	}

	// This setter method assigns value to the variable (name) passed through the method

	public void setName(String c)

	{

	name = c;

	}

	// This getter method returns name variable(string) when called

	public String getName()

	{

	return name;

	}

	// This getter method returns Id(long) variable when it is called

	public long getId()

	{

	return id ;

	}

	//This setter method assigns value to the ID(long)) passed through the method

	public void setId(long id)

	{

	this.id = id;

	}

	public void setGrade(String grade)

	{

	this.grade = grade;

	}

	// This getter method returns name variable(string) when called

	public String getGrade()

	{

	return grade;

	}

	public int getTestScore(int index) {

	return test[index];

	}

	public void setTestScore(int index,int mark)

	{

	test[index] = mark;

	}

	public int getNumTests() {

	return NUM_TESTS;

	}

	// This getter method returns course(String) variable when it is called

	public String getCourse()

	{

	return grade ;

	}

	//This setter method assigns value to the course(course)) passed through the method

	public void setCourse(String course)

	{

	this.grade = course;

	}

	/** default to string function

	*of object class was overridden and this method returns the string mentioned below

	*/

	public String toString() {

	return "Student Result [Name = " + name + ", Student ID = " + id + ", Grade =" + grade +"]";

	}

	public abstract void calculateResult();

	}



