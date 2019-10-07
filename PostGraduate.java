package calculateResult;

public class PostGraduate extends Student {

//Author- Mohd Ismail Farooq Lakhani 
	
	// Default constructor is created ,if not java will create a default one

	public PostGraduate() {

	super();

	}

	// Another constructor is created with overloading of constructor

	public PostGraduate(String name, long id )

	{

	super(name, id);

	}


	@Override
	public void calculateResult() {
		

	int total_marks=0,average=0;

	for (int index =0;index< getNumTests();index++)

	{

	int test_score = getTestScore(index);

	total_marks= total_marks + test_score;

	}

	average=total_marks/getNumTests();

	if (average >=50){

	setGrade("Pass");

	}

	else

	{

	setGrade("Fail");

	}

	System.out.println("The average marks of the postgraduate student "+getName() + " for the " + getNumTests() + " tests is " + average);

	}//end of calculateResult

	}//end of class
	
