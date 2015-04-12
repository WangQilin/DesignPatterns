package singleton;

public class SingletonDemo {

	public static void main(String[] args) {
		
		BillPughSingleton billPughSingleton_1 = BillPughSingleton.getInstance();
		BillPughSingleton billPughSingleton_2 = BillPughSingleton.getInstance();
		if (billPughSingleton_1 == billPughSingleton_2) {
			System.out.println("BillPughSingleton works");
		} else {
			System.out.println("BillPughSingleton doesn't work");
		}
		
		
		EagerSingleton eagerSingleton_1 = EagerSingleton.getInstance();
		EagerSingleton eagerSingleton_2 = EagerSingleton.getInstance();
		if (eagerSingleton_1 == eagerSingleton_2) {
			System.out.println("EagerSingleton works");
		} else {
			System.out.println("EagerSingleton doesn't work");
		}
		
		
		LazySingleton lazySingleton_1 = LazySingleton.getInstance();
		LazySingleton lazySingleton_2 = LazySingleton.getInstance();
		if (lazySingleton_1 == lazySingleton_2) {
			System.out.println("LazySingleton works");
		} else {
			System.out.println("LazySingleton doesn't work");
		}
		
		
		StaticBlockSingleton staticBlockSingleton_1 = StaticBlockSingleton.getInstance();
		StaticBlockSingleton staticBlockSingleton_2 = StaticBlockSingleton.getInstance();
		if (staticBlockSingleton_1 == staticBlockSingleton_2) {
			System.out.println("StaticBlockSingleton works");
		} else {
			System.out.println("StaticBlockSingleton doesn't work");
		}
		
		
		ThreadSafeSingleton threadSafeSingleton_1 = ThreadSafeSingleton.getInstance();
		ThreadSafeSingleton threadSafeSingleton_2 = ThreadSafeSingleton.getInstance();
		if (threadSafeSingleton_1 == threadSafeSingleton_2) {
			System.out.println("ThreadSafeSingleton works");
		} else {
			System.out.println("ThreadSafeSingleton doesn't work");
		}
		
	}
}
