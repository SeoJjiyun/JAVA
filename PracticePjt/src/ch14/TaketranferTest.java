package ch14;

public class TaketranferTest {

	public static void main(String[] args) {
		
		Student studentJ = new Student("James", 5000);
		Student studentT = new Student("Tomas", 10000);
		
		Bus bus100 = new Bus(100);
		studentJ.takeBus(bus100);
		
		Subway subwayG = new Subway(2);
		studentT.takeSubway(subwayG);
		
		studentT.showInfo();
		studentJ.showInfo();
		
		bus100.showBusifo();
		subwayG.subwayInfo();
	}

}
