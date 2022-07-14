package gradeprogramwithoutinterface;

import java.util.ArrayList;

public class MainTest {

	public static void main(String[] args) {
		Subject subjectK = new Subject("국어",0001);
		Subject subjectM = new Subject("수학",0002);
		
		Student studentKang = new Student("강감찬", 211213, "국어");
		Student studentKim = new Student("김유신", 212330, "수학");
		Student studentShin = new Student("신사임당", 201518,"국어");
		Student studentLee = new Student("강감찬", 202360,"국어");
		Student studentHong = new Student("홍길동", 201290,"수학");
		
		ArrayList<Student> studentList = new ArrayList<>();
		
		studentList.add(studentKang);
		studentList.add(studentKim);
		studentList.add(studentShin);
		studentList.add(studentLee);
		studentList.add(studentHong);
		
		
		for(Student student : studentList) {
			System.out.println(student.getStdName() + " | " + student.getStdId() + " | " + student.getMajorSb());
		}
		
	
	
	}

}
