package gradeprogramwithoutinterface;

import java.util.ArrayList;

public class Student {
	
	private String stdName;
	private int stdId;
	private String majorSb;
	
	private ArrayList<Score> scoreArray = new ArrayList<>();
	
	public Student(String stdName, int stdId, String majorSb) {
		this.stdId = stdId;
		this.stdName = stdName; 
		this.majorSb = majorSb;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	public String getMajorSb() {
		return majorSb;
	}

	public void setMajorSb(String majorSb) {
		this.majorSb = majorSb;
	}

	public ArrayList<Score> getScoreArray() {
		return scoreArray;
	}

	public void setScoreArray(ArrayList<Score> scoreArray) {
		this.scoreArray = scoreArray;
	}
	
	

	
	
}
