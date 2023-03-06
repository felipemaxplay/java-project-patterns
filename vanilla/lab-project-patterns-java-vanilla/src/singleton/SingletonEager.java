package singleton;

public class SingletonEager {
    private static SingletonEager SingletonEagerInstance = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getSingletonEagerInstance() {
        return SingletonEagerInstance;
    }
}
