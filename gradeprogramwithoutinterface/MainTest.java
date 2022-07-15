package gradeprogramwithoutinterface;

import java.util.ArrayList;

public class MainTest {

	public static void main(String[] args) {
		Subject subjectK = new Subject("����",0001);
		Subject subjectM = new Subject("����",0002);
		
		Student studentKang = new Student("������", 211213, subjectK );
		Student studentKim = new Student("������", 212330, subjectM);
		Student studentShin = new Student("�Ż��Ӵ�", 201518,subjectK);
		Student studentLee = new Student("������", 202360,subjectK);
		Student studentHong = new Student("ȫ�浿", 201290,subjectM);
		
		ArrayList<Student> StuArray = new ArrayList<Student>();
		StuArray.add(studentKang);
		StuArray.add(studentKim);
		StuArray.add(studentShin);
		StuArray.add(studentLee);
		StuArray.add(studentHong);
		
		subjectK.setStdArray(StuArray);
		
		subjectK.showTitleinfo();
		for(Student student : subjectK.getStdArray()) {
			System.out.println(student.getStdName() + " | " + student.getStdId() + " | " + student.getMajorSb());
		}
		
	
	
	}

}
