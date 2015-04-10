package paypal;

// abstract factory creates a factory of factories
public class Main {
	public static void main(String[] args) {
		// get respective animal factory
		AnimalFactory landAnimalFactory = FactoryProducer.getFactory("LandAnimal");
		AnimalFactory aquaticAnimalFactory = FactoryProducer.getFactory("AquaticAnimal");
		
		// construct instances using factory
		LandAnimal animal_1 = landAnimalFactory.getLandAnimal("Lion");
		LandAnimal animal_2 = landAnimalFactory.getLandAnimal("Tiger");
		AquaticAnimal animal_3 = aquaticAnimalFactory.getAquaticAnimal("Shark");
		AquaticAnimal animal_4 = aquaticAnimalFactory.getAquaticAnimal("Dolphin");
		
		// test instance behaviors
		animal_1.run();
		animal_2.run();
		animal_3.swim();
		animal_4.swim();
	}
}
