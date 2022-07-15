package gradeprogramwithoutinterface;

public class Score {
	String grade;
	int score;
	
	public Score(int score) {
		this.score = score;
	}
	
	public String calGrade(int score) {
		if(score >= 90 && score <= 100)
			grade = "A";
		else if(score >= 80 && score < 90)
			grade = "B";
		else if(score >= 70 && score < 80)
			grade = "C";
		else if(score >= 55 && score < 70)
			grade = "D";
		else 
			grade = "F";
		return score +"|"+grade;
	}
	
	
}
