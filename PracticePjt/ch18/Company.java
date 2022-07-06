package ch18;

public class Company {
	
	private static Company instance = new Company(); //유일한 객체
	
	private Company() { //외부에서 생성자를 new 할 수 없도록
		
	}
	
	public static Company getInstance() { //유일한 객체를 외부에서 쓰도록
		
		if(instance ==null) {
			instance = new Company();
		}
		return instance;
	}
}
