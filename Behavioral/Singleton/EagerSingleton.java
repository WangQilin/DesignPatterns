public class EagerSingleton {
	private static final EagerSingleton instance = new EagerSingleton();

	private EagerSingleton() {

	}

	public EagerSingleton getInstance() {
		return instance;
	}
}