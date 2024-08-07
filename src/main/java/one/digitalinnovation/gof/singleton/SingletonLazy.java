package one.digitalinnovation.gof.singleton;

/**
 * Singleton "Lazy"
 *
 * @author andrezatcascais
 */
public class SingletonLazy {

    // Initially, the instance is not provided,
    // it has an instance of itself for the user.
    private static SingletonLazy instance;

    // To ensure that nobody externally instantiates this SingletonLazy,
    // this constructor has to be private.
    private SingletonLazy() {
        // Explicitly call the parent class constructor,
        // just for the sake of clarity. It is not necessary,
        // as the result would be the same with or without it.
        super();
    }

    // To expose the instance to the caller, we need to create
    // a public static method. However, this instance is not ready to be returned
    // as it obviously needs to be instantiated first,
    // hence the implementation includes an if check.
    // If the instance is null, it will be created.
    public static SingletonLazy getInstance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }
}
