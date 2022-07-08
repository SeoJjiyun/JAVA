package gradeprogram;

import java.util.ArrayList;

public class Student {
	
	int stdId;
	String stdName;
	ArrayList<Subject> subjectList;
	
	public Student(int stdId, String stdName) {
		this.stdId = stdId;
		this.stdName = stdName;
		
		subjectList = new ArrayList<>();
	}
	
	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		
		subject.setName(name);
		subject.setScore(score);
		subjectList.add(subject);
	}
	
	public void studentShowinfo() {
		int total = 0;
		
		for(Subject s: subjectList) {
			total += s.getScore();
			System.out.println("학생 "+ stdName + "의 " + s.getName() + "성적은 " + s.getScore() + "점 입니다.");		 
		}
		
		System.out.println("총점은 "+total+"점 입니다.");
	}
}
