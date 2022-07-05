package ch15;

public class Person {
	
	String name;
	int money;
	int remain;
	
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void takeTaxi(Taxi taxi) {
		taxi.take(10000);
		this.money -= 10000;
	}
	
	public void showPerinfo() {
		System.out.println(name + "님의 남은 돈은 " + money + "원 입니다.");
	}
}
