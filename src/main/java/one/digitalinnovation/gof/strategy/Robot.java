package one.digitalinnovation.gof.strategy;

public class Robot {

    /**
     * our strategy for robot behavior
     * strategy = behavior
     */
    private Behavior strategyBehavior;

    /**
     * The robot may want to change its strategy,
     * so we must define the set method to enable this behavior.
     * @param strategyBehavior
     */
    public void setStrategyBehavior(Behavior strategyBehavior) {
        this.strategyBehavior = strategyBehavior;
    }

    /**
     * We need to make sure this robot moves
     */
    public void move() {
        /**
         * This will delegate the responsibility for movement to our strategy.
         * It will take the behavior assigned to the robot and make it move."
         */
        strategyBehavior.move();
    }


}
