package one.digitalinnovation.gof.strategy;

public class AggressiveBehavior implements Behavior{
    @Override
    public void move() {
        System.out.println("This move has been aggressive behavior.");
    }
}
