package one.digitalinnovation.gof.strategy;

public class NormalBehavior implements Behavior{
    @Override
    public void move() {
        System.out.println("This move has been normal behavior.");
    }
}
