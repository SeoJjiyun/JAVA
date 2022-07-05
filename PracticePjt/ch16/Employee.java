package ch16;

public class Employee {
	
	public static int serialNum = 1000;
	
	private int employeeId;
	private String employeeName;
	private String department;
	
	
	public Employee() {
		serialNum++;
		employeeId = serialNum; //serialNum은 다른 변수들과 함께 공유되므로, 생성자를 만들어 해당변수에 저장
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}	

}
