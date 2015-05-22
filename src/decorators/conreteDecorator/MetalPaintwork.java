package decorators.conreteDecorator;

import component.CarType;

import decorators.ExtraEquipment;

public class MetalPaintwork extends ExtraEquipment {

	public MetalPaintwork(CarType car) {
		this.car = car;
	}

	@Override
	public String getDescription() {
		return car.getDescription() + ", Metal Paintwork";
	}

	@Override
	public int cost() {
		return 5000 + car.cost();
	}

}
