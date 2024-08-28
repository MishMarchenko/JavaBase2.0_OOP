
public class Main {
    public static void main(String[] args) {

        Pet pet = new Pet("Bobik", 8);
        Pet pet3 = new Pet("Bobik", 8);
        Pet pet1 = new Pet();


        System.out.println(pet.getName());

        pet1.setName("Bobik1");
        pet1.setAge(7);
        System.out.println(pet1.getName());


        pet.saySomething();
        System.out.println(pet);
        System.out.println(pet == pet3);
        System.out.println(pet.equals(pet3));

        Car car1 = new Car("Dawoo", 4);
        Car car2 = new Car("Dawoo", 4);
        Car car3 = new Car();
        car3.setDoors(5);
        car3.setName("Opel");
        System.out.println(car3.getDoors());
        System.out.println(car3.getName());
        System.out.println(car3);
        System.out.println(car1.equals(car2));
    }
}