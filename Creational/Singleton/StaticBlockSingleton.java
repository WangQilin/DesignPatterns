// make use of static block
// will be created even before it's used

public class StaticBlockSingleton {
    private static StaticBlockSingleton instance;

    private StaticBlockSingleton() {

    }

    static {
        try {
            instance = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurs when creating instance");
        }
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }
}