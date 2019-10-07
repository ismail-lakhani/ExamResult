package calculateResult;

//Author- Mohd Ismail Farooq Lakhani
public class UnderGraduate extends Student {

	// Default constructor is created ,if not java will create a default one

	public UnderGraduate() {

	super();

	}

	// Another constructor is created with overloading of constructor

	public UnderGraduate(String name, long id )

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

	if (average >=40){

	setGrade("Pass");

	}

	else

	{

	setGrade("Fail");

	}

	System.out.println("The average marks of the undergraduate student "+getName() + " in the " + getNumTests() + " tests is " + average);

	}//end of calculateResult

	}//end of class


