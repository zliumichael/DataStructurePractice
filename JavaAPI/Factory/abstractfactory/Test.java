package Factory.abstractfactory;

public class Test {

	public static void main(String[] args) {
		BMWCarFactory bmwFactory = new BMWCarFactory();
		
		Car bmwSportsCar = bmwFactory.createSportsCar();
		bmwSportsCar.run();
		
		Car bmwBusinessCar = bmwFactory.createBusinessCar();
		bmwBusinessCar.run();
		
		BenzCarFactory benzFactory = new BenzCarFactory();
		
		Car benzSportsCar = benzFactory.createSportsCar();
		benzSportsCar.run();
		
		Car benzBusinessCar = benzFactory.createBusinessCar();
		benzBusinessCar.run();
	}
}
