package one.digitalinnovation.gof.strategy;

public class DefensiveBehavior implements Behavior{
    @Override
    public void move() {
         System.out.println("This move has been defensive behavior.");
    }
}
