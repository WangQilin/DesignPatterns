package abstractfactory;

public class FactoryProducer {
	public static AnimalFactory getFactory(String name) {
		if (name.equalsIgnoreCase("AquaticAnimal")) {
			return new AquaticAnimalFactory();
		} else if (name.equalsIgnoreCase("LandAnimal")) {
			return new LandAnimalFactory();
		}
		
		return null;
	}
}
