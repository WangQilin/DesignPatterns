package abstractfactory;

public interface AnimalFactory {
	LandAnimal getLandAnimal(String name);
	AquaticAnimal getAquaticAnimal(String name);
}
