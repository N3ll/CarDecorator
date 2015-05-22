package decorators;

import component.CarType;

public abstract class ExtraEquipment extends CarType {
	protected CarType car;

	@Override
	public abstract String getDescription();
}
