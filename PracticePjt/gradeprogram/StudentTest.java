package gradeprogram;

public class StudentTest {
	public static void main(String[] args) {
		Student studentL = new Student(1001, "Lee");
		Student studentK = new Student(1002, "Kim");
		
		studentL.addSubject("국어", 100);
		studentL.addSubject("수학", 50);
		
		
		studentK.addSubject("국어", 70);
		studentK.addSubject("수학", 85);
		studentK.addSubject("영어", 100);
		
		studentL.studentShowinfo();
		studentK.studentShowinfo();
	}
}
