package day37_inheritance;

public class FinalExam extends GradeActivity{
	
	private int numQuestion;
	private double pointsEach;
	private int numMissed;
	
	public FinalExam ( int numQuestion,  int numMissed) {
		
		double numericScore;
		
		this.numQuestion=numQuestion;
		this.numMissed=numMissed;
		
		pointsEach = 100.0/numQuestion;
		
		numericScore = 100.0 - (numMissed * pointsEach); //76
		
		setScore (numericScore);
		
		
	}
	
	public double getPointsEach() {
		return pointsEach;
		
	}

}
