package Test;

public abstract class Burger implements Item {

	@Override
	public Packing getPacking() {
		return new Wrapper();
	}

	@Override
	public abstract float getPrice();

}
