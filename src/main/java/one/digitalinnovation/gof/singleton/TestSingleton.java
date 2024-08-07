package one.digitalinnovation.gof.singleton;

public class TestSingleton {
    public static void main(String[] args) {
        // How to validate if Singleton pattern is working?
        // We should initialize each of them.
          validateSingletonLazy();
          validateSingletonEager();
          validateSingletonLazyHolder();
    }

    private static void validateSingletonLazy() {
        SingletonLazy singletonLazy1 = SingletonLazy.getInstance();
        System.out.println("Instance Singleton Lazy1: " + singletonLazy1);
        singletonLazy1 = SingletonLazy.getInstance();
        System.out.println("Same Instance Singleton Lazy1: " + singletonLazy1);

        SingletonLazy singletonLazy2 = SingletonLazy.getInstance();
        System.out.println("Same Instance Singleton Lazy2: " + singletonLazy2);
    }

    private static void validateSingletonEager() {
        SingletonEager singletonEager1 = SingletonEager.getInstance();
        System.out.println("Instance Singleton Eager1: " + singletonEager1);
        singletonEager1 = SingletonEager.getInstance();
        System.out.println("Same Instance Singleton Eager1: " + singletonEager1);

        SingletonEager singletonEager2 = SingletonEager.getInstance();
        System.out.println("Same Instance Singleton Eager2: " + singletonEager2);
    }

    private static void validateSingletonLazyHolder() {
        SingletonLazyHolder singletonLazyHolder1 = SingletonLazyHolder.getInstance();
        System.out.println("Instance Singleton LazyHolder1: " + singletonLazyHolder1);
        singletonLazyHolder1 = SingletonLazyHolder.getInstance();
        System.out.println("Same Instance Singleton LazyHolder1: " + singletonLazyHolder1);

        SingletonLazyHolder singletonLazyHolder2 = SingletonLazyHolder.getInstance();
        System.out.println("Same Instance Singleton LazyHolder2: " + singletonLazyHolder2);
    }
}