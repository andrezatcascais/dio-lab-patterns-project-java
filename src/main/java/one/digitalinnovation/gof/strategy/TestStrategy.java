package one.digitalinnovation.gof.strategy;

public class TestStrategy {

    public static void main(String[] args) {
        NormalBehavior normalBehavior = new NormalBehavior();
        DefensiveBehavior defensiveBehavior = new DefensiveBehavior();
        AggressiveBehavior aggressiveBehavior = new AggressiveBehavior();

        Robot robot = new Robot();
        // The behavior type was defined
        robot.setStrategyBehavior(normalBehavior);
        // Here, it will make the movement according to the type of behavior or strategy chosen.
        robot.move();
        robot.move();

        robot.setStrategyBehavior(defensiveBehavior);
        robot.move();

        robot.setStrategyBehavior(aggressiveBehavior);
        robot.move();
        robot.move();
        robot.move();
    }
}
