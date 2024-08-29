package Inheritence;

public class Duck extends Animal implements Flyable, Eggs{
    @Override
    public void CreateEggs() {
        System.out.println("I create eggs");
    }

    @Override
    public void eat() {
        System.out.println("Duck is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Duck is sleeping");
    }

    @Override
    public void fly() {
        System.out.println("Duck is flying");
    }
}
