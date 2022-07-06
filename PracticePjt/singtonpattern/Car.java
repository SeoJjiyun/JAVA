package singtonpattern;

public class Car {
	
	private int carNum;
	private static int serialNum = 10000; //static으로 하지 않으면 차의 serialNum가 모두 일치한다. 
	
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
