package component;

public abstract class CarType {
	protected String description;
	protected double branchValue;

	public String getDescription() {
		return this.description;
	}

	public abstract int cost();
}
