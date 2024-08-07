package one.digitalinnovation.gof.singleton;
/**
 * Singleton "LazyHolder"
 *
 * @see <a href="https://stackoverflow.com/a/24018148">Reference about Lazy Holder</a>
 *
 * @author andrezatcascais
 * SingletonLazyHolder has a more optimised memory usage and consumption.
 */
public class SingletonLazyHolder {

    // Create a static inner class (because in singleton everything is static),
    // i.e., a class within this Singleton that will hold the instance.
    // This class only functions to encapsulate the instance of the SingletonHolder class.
    private static class InstanceHolder {
        // It will encapsulate this instance in an internal static Holder class.
        // This instance has to be public to be accessible.
        public static SingletonLazyHolder instance = new SingletonLazyHolder();
    }

    // To ensure that nobody externally instantiates this SingletonLazyHolder,
    // this constructor has to be private.
    private SingletonLazyHolder() {
        // Explicitly call the parent class constructor,
        // just for the sake of clarity. It is not necessary,
        // as the result would be the same with or without it.
        super();
    }

    // When someone calls this public method that exposes the instance of this class, it will already be instantiated
    // because it was defined with the new keyword assigned to it.
    public static SingletonLazyHolder getInstance() {
        // Here, when accessing this instance, it will always be accessed via the inner class InstanceHolder.
        return InstanceHolder.instance;
    }
}
