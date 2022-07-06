package singtonpattern;

public class Carfactory {
	
	
	private static Carfactory instance = new Carfactory();
	
	private Carfactory() { 
		
	}
	
	public static Carfactory getInstance() {
		if(instance == null) {
			instance = new Carfactory();
		}
		return instance;
	}
	
	public Car createCar() {
		
		Car car = new Car();
		return car;
		
	}
}
