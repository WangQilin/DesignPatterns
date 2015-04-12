package singleton;

// use synchronized keyword to make the implementation thread-safe
public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {

    }

    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }

        return instance;
    }
    
//    ** but synchronized implementation is too costly, below is the implementation which uses double-checked locking
//    public static synchronized ThreadSafeSingleton getInstance() {
//        if (instance == null) {
//            synchronized (ThreadSafeSingleton.class) {
//                if (instance == null) {
//                    instance = new ThreadSafeSingleton();
//                }
//            }
//        }
//
//        return instance;
//    }
}