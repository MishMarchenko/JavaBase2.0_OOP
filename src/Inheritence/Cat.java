package Inheritence;

public class Cat extends Animal{

    private String name;
    private int age;
    private int paws;
    private int tail;
    private int weight;

    public Cat(String name, int age, int paws, int tail, int weight) {
        this.name = name;
        this.age = age;
        this.paws = paws;
        this.tail = tail;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", paws=" + paws +
                ", tail=" + tail +
                ", weight=" + weight +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            try{
                throw new Exception("The cat must have age more than 0");
            } catch (Exception e){
                throw new RuntimeException(e);
            }
        }
        this.age = age;
    }

    public int getPaws() {
        return paws;
    }

    public void setPaws(int paws) {
        this.paws = paws;
    }

    public int getTail() {
        return tail;
    }

    public void setTail(int tail) {
        this.tail = tail;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight < 0){
            System.out.println("The cat must have weight more than 0");
        }
        else {
            this.weight = weight;
        }
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping");
    }
}
