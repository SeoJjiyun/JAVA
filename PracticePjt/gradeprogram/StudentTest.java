package gradeprogram;

public class StudentTest {
	public static void main(String[] args) {
		Student studentL = new Student(1001, "Lee");
		Student studentK = new Student(1002, "Kim");
		
		studentL.addSubject("����", 100);
		studentL.addSubject("����", 50);
		
		
		studentK.addSubject("����", 70);
		studentK.addSubject("����", 85);
		studentK.addSubject("����", 100);
		
		studentL.studentShowinfo();
		studentK.studentShowinfo();
	}
}
