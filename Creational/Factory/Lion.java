package factory;

public class Lion implements Animal{

	@Override
	public String getName() {
		return "Lion";
	}

	@Override
	public void Roar() {
		System.out.println("ahhhhhhh");
	}

}
