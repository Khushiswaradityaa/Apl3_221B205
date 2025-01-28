/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


public class Main {
    public static void main(String[] args) {
        Duck rubberDuck = new RubberDuck();
        Duck woodenDuck = new WoodenDuck();
        Duck redHeadDuck = new RedHeadDuck();
        Duck lakeDuck = new LakeDuck();

        System.out.println("Rubber Duck:");
        rubberDuck.swim();
        ((Squeakable) rubberDuck).squeak();

        System.out.println("\nWooden Duck:");
        woodenDuck.swim();
        ((Muteable) woodenDuck).mute();

        System.out.println("\nRedHead Duck:");
        redHeadDuck.swim();
        ((Quackable) redHeadDuck).quack();
        ((Flyable) redHeadDuck).fly();

        System.out.println("\nLake Duck:");
        lakeDuck.swim();
        ((Quackable) lakeDuck).quack();
        ((Flyable) lakeDuck).fly();
    }
}
