package paypal;

public class LandAnimalFactory implements AnimalFactory{

	@Override
	public LandAnimal getLandAnimal(String name) {
		
		if (name.equalsIgnoreCase("Lion")) {
			return new Lion();
		} else if (name.equalsIgnoreCase("Tiger")) {
			return new Tiger();
		}
		
		return null;
	}

	@Override
	public AquaticAnimal getAquaticAnimal(String name) {
		return null;
	}
	
}
