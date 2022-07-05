package ch15;

public class Tranfertest {
	public static void main(String[] args) {
		
		Person personE = new Person("Edward", 20000);
		Taxi taxiJ = new Taxi("잘 나간다 운수");
		
		personE.takeTaxi(taxiJ);
		
		personE.showPerinfo();
		taxiJ.showTaxiinfo();
		
	}
}
