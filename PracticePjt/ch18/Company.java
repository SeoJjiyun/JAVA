package ch18;

public class Company {
	
	private static Company instance = new Company(); //������ ��ü
	
	private Company() { //�ܺο��� �����ڸ� new �� �� ������
		
	}
	
	public static Company getInstance() { //������ ��ü�� �ܺο��� ������
		
		if(instance ==null) {
			instance = new Company();
		}
		return instance;
	}
}
