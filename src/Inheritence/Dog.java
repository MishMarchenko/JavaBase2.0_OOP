package Inheritence;

public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("I am eating");
    }

    @Override
    public void sleep() {
        System.out.println("I am sleeping");
    }
}
