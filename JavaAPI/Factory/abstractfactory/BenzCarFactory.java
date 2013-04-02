package Factory.abstractfactory;

public class BenzCarFactory implements AbstractCarFactory {

	@Override
	public Car createSportsCar() {
		
		return new BenzSportsCar();
	}

	@Override
	public Car createBusinessCar() {
		
		return new BenzBusinessCar();
	}

}
