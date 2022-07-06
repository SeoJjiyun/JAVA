package singtonpattern;

public class CarTest {
	public static void main(String[] args) {
		Carfactory factory = Carfactory.getInstance(); //sington pattern ����
		Car mySonata = factory.createCar();	//createCar()�� �������� Car
		Car yourSonata = factory.createCar();
		
		System.out.println(mySonata.getCarNum());
		System.out.println(yourSonata.getCarNum());
	}

}
