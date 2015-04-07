package JavaFactory;

public class Main {

	public static void main(String[] args) {
		Animal cat = AnimalFactory.getAnimal("cat");
		Animal lion = AnimalFactory.getAnimal("lion");

		cat.Roar();
		lion.Roar();
	}
}
