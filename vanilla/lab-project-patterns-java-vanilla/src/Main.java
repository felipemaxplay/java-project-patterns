import singleton.SingletonEager;
import singleton.SingletonLazy;
import singleton.SingletonLazyHolder;

public class Main {
    public static void main(String[] args) {
        SingletonLazy lazy = SingletonLazy.getSingletonLazyInstance();
        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getSingletonLazyInstance();
        SingletonEager eager = SingletonEager.getSingletonEagerInstance();

        System.out.println(lazy);
        System.out.println(lazyHolder);
        System.out.println(eager);

        System.out.println("-----------------------------------");

        // Second time for Test
        lazy = SingletonLazy.getSingletonLazyInstance();
        lazyHolder = SingletonLazyHolder.getSingletonLazyInstance();
        eager = SingletonEager.getSingletonEagerInstance();

        System.out.println(lazy);
        System.out.println(lazyHolder);
        System.out.println(eager);
    }
}