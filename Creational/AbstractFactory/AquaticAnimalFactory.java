package abstractfactory;

public class AquaticAnimalFactory implements AnimalFactory{

	@Override
	public LandAnimal getLandAnimal(String name) {
		return null;
	}

	@Override
	public AquaticAnimal getAquaticAnimal(String name) {
		if (name.equalsIgnoreCase("Dolphin")) {
			return new Dolphin();
		} else if (name.equalsIgnoreCase("Shark")) {
			return new Shark();
		}
		
		return null;
	}

}
