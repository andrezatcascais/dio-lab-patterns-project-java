package one.digitalinnovation.gof.singleton;
/**
 * Singleton "Eager"
 *
 * @author andrezatcascais
 */
public class SingletonEager {

    // At the moment the static variable is defined, the instance is already assigned.
    // That is, when this SingletonEager class is accessed by someone, this instance
    // is already assigned, and when someone calls the public method, it will be available and instantiated.
    private static SingletonEager instance = new SingletonEager();

    // To ensure that nobody externally instantiates this SingletonEager,
    // this constructor has to be private.
    private SingletonEager() {
        // Explicitly call the parent class constructor,
        // just for the sake of clarity. It is not necessary,
        // as the result would be the same with or without it.
        super();
    }

    // When someone calls this public method that exposes the instance of this class, it will already be instantiated
    // because it was defined with the new keyword assigned to it.
    public static SingletonEager getInstance() {
        return instance;
    }
}
