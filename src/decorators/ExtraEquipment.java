package decorators;

import component.CarType;

public abstract class ExtraEquipment extends CarType {
	protected int number;
	protected CarType car;

	@Override
	public abstract String getDescription();
}
