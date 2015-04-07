package JavaFactory;

public class Cat implements Animal{

	@Override
	public String getName() {
		return "Cat";
	}

	@Override
	public void Roar() {
		System.out.println("miao~~~");
	}

}
