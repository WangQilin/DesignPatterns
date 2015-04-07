package JavaFactory;

public class AnimalFactory {
	public static Animal getAnimal(String name) {
		if ("lion".equalsIgnoreCase(name)) {
			return new Lion();
		} else if ("cat".equalsIgnoreCase(name)) {
			return new Cat();
		}
		
		return null;
	}
}
