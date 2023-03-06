import singleton.SingletonEager;
import singleton.SingletonLazy;
import singleton.SingletonLazyHolder;
import strategy.*;

public class Main {
    public static void main(String[] args) {
        // Singleton
        SingletonLazy lazy = SingletonLazy.getSingletonLazyInstance();
        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getSingletonLazyInstance();
        SingletonEager eager = SingletonEager.getSingletonEagerInstance();

        System.out.println(lazy);
        System.out.println(lazyHolder);
        System.out.println(eager);

        System.out.println("---------------------------------------");

        // Second time for Test
        lazy = SingletonLazy.getSingletonLazyInstance();
        lazyHolder = SingletonLazyHolder.getSingletonLazyInstance();
        eager = SingletonEager.getSingletonEagerInstance();

        System.out.println(lazy);
        System.out.println(lazyHolder);
        System.out.println(eager);

        System.out.println("---------------------------------------");

        // Strategy
        Behavior normal = new NormalBehavior();
        Behavior defense = new DefenseBehavior();
        Behavior angry = new AngryBehavior();

        Robot robot = new Robot();

        robot.setBehavior(normal);

        robot.move();
        robot.move();

        robot.setBehavior(defense);

        robot.move();

        robot.setBehavior(angry);

        robot.move();

        System.out.println("---------------------------------------");
    }
}