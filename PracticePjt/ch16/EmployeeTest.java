package ch16;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employeeLee = new Employee();
		employeeLee.setEmployeeName("이순신");
		
		System.out.println(Employee.serialNum); //	serialNum이 static 변수이므로 생성자.serialNum으로 해도 좋다. ex) System.out.println(employeeLee.serialNum);
		
		Employee employeeKim = new Employee();
		employeeKim.setEmployeeName("김유신");
		employeeKim.serialNum++;
		
		//System.out.println(employeeLee.serialNum);
	//	System.out.println(employeeKim.serialNum); //두개의 메모리가 하나의 변수를 공유하는 것을 알 수 있음
		System.out.println(employeeLee.getEmployeeName() +"님의 아이디는"+ employeeLee.getEmployeeId() );
		System.out.println(employeeKim.getEmployeeName() +"님의 아이디는"+ employeeKim.getEmployeeId() );
	}

}
