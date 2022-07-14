package Membership;

public class Customer { // 고객 속성 : 아이디, 이름, 등급, 보너스 포인트, 적립비율
	
	protected int customerID; // 고객의 중요한 정보 -> private but 상속에서는 사용해야하므로 protected으로 변경
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio; //package default -> 외부 패키지에서는 사용 불가
	
	public Customer() { //기본 정보 & default 생성자
		
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	/*
	public Customer(customerID,customerName){ // 이 경우는 default 생성자가 아니므로, VIPCustomer에서 (상위클래스에서 하위클래스로 확장할때,) 명시적으로 호출해야함
		this.customerID = customerID;
		this.coustomerName = customerName;
		
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	*/
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price; //적립만
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public String showCoustomerinfo() {
		return customerName+"님의 등급은 "+customerGrade +"이며, 보너스 포인트는 " + bonusPoint + "입니다.";
	}
}
