package singtonpattern;

public class Car {
	
	private int carNum;
	private static int serialNum = 10000; //static���� ���� ������ ���� serialNum�� ��� ��ġ�Ѵ�. 
	
	public Car() {
		serialNum++;
		carNum = serialNum;
	}
	
	public int getCarNum() {
		return carNum;
	}
	
	private void setCarNum(int carNum) {
		this.carNum = carNum;
	}
	
	

}
