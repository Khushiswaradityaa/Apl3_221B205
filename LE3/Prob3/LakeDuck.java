
public class LakeDuck implements Duck, Quackable, Flyable {
    public void swim() {
        System.out.println("Lake Duck is swimming.");
    }

    public void quack() {
        System.out.println("Lake Duck quacks!");
    }

    public void fly() {
        System.out.println("Lake Duck is flying.");
    }
}
