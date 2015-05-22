package component;

public abstract class CarType {
	protected String description;

	public String getDescription() {
		return this.description;
	}

	public abstract int cost();
}
