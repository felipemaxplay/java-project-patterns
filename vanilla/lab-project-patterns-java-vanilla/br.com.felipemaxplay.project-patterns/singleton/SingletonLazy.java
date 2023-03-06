package singleton;

public class SingletonLazy {
    private static SingletonLazy SingletonLazyInstance;

    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getSingletonLazyInstance() {
        if(SingletonLazyInstance == null) {
            SingletonLazyInstance = new SingletonLazy();
        }

        return SingletonLazyInstance;
    }
}