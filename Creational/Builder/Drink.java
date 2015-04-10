package Test;

public abstract class Drink implements Item {

	@Override
	public Packing getPacking() {
		return new Bottle();
	}

	@Override
	public abstract float getPrice();

}
