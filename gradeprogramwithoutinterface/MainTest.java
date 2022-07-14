package gradeprogramwithoutinterface;

import java.util.ArrayList;

public class MainTest {

	public static void main(String[] args) {
		Subject subjectK = new Subject("����",0001);
		Subject subjectM = new Subject("����",0002);
		
		Student studentKang = new Student("������", 211213, "����");
		Student studentKim = new Student("������", 212330, "����");
		Student studentShin = new Student("�Ż��Ӵ�", 201518,"����");
		Student studentLee = new Student("������", 202360,"����");
		Student studentHong = new Student("ȫ�浿", 201290,"����");
		
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
