package gradeprogramwithoutinterface;

import java.util.ArrayList;

public class MainTest {

	public static void main(String[] args) {
		Subject subjectK = new Subject("국어",0001);
		Subject subjectM = new Subject("수학",0002);
		
		Student studentKang = new Student("강감찬", 211213, subjectK );
		Student studentKim = new Student("김유신", 212330, subjectM);
		Student studentShin = new Student("신사임당", 201518,subjectK);
		Student studentLee = new Student("강감찬", 202360,subjectK);
		Student studentHong = new Student("홍길동", 201290,subjectM);
		
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
