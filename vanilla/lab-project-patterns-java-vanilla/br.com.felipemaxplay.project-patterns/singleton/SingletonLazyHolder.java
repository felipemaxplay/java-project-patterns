package singleton;

public class SingletonLazyHolder {
    private static class InstanceHolder {
        public static SingletonLazyHolder SingletonLazyInstance = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getSingletonLazyInstance() {
        return InstanceHolder.SingletonLazyInstance;
    }
}