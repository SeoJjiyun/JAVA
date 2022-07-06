package singtonpattern;

public class CarTest {
	public static void main(String[] args) {
		Carfactory factory = Carfactory.getInstance(); //sington pattern 구현
		Car mySonata = factory.createCar();	//createCar()의 변수형은 Car
		Car yourSonata = factory.createCar();
		
		System.out.println(mySonata.getCarNum());
		System.out.println(yourSonata.getCarNum());
	}

}
