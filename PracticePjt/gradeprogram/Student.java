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
			System.out.println("�л� "+ stdName + "�� " + s.getName() + "������ " + s.getScore() + "�� �Դϴ�.");		 
		}
		
		System.out.println("������ "+total+"�� �Դϴ�.");
	}
}
