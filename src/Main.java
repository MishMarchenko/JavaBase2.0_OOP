import Inheritence.A;
import Inheritence.B;
import Inheritence.C;
import Inheritence.Cat;
import Inheritence.Duck;
import Nested.Calc;
import Nested.Season;
import Nested.Url;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Pet pet = new Pet("Bobik", 8);
//        Pet pet3 = new Pet("Bobik", 8);
//        Pet pet1 = new Pet();
//        System.out.println(pet.getName());
//        pet1.setName("Bobik1");
//        pet1.setAge(7);
//        System.out.println(pet1.getName());
//        pet.saySomething();
//        System.out.println(pet);
//        System.out.println(pet == pet3);
//        System.out.println(pet.equals(pet3));
//
//        Car car1 = new Car("Dawoo", 4);
//        Car car2 = new Car("Dawoo", 4);
//        Car car3 = new Car();
//        car3.setDoors(5);
//        car3.setName("Opel");
//        System.out.println(car3.getDoors());
//        System.out.println(car3.getName());
//        System.out.println(car3);
//        System.out.println(car1.equals(car2));
//
//        A a = new A();
//        B b = new B();
//        C c = new C();
//        a.print();
//        b.print();
//        c.print();
//        c.methodClassA();
//        c.printing();
//
//        Duck duck = new Duck();
//        duck.eat();
//
//        Cat cat = new Cat("Billy", 5, 4, 1, 3);
//        System.out.println(cat);
//        System.out.println(cat.getName()+ " " + cat.getAge());
//        cat.setAge(4);
//        cat.setWeight(-10);
//        System.out.println(cat);
//        System.out.println(Arrays.toString(Season.values()));
//        switch (16){
//            case 12:
//            case 1:
//            case 2:
//                System.out.println(Season.Winter.getValue());
//                break;
//            case 3:
//            case 4:
//            case 5:
//                System.out.println(Season.Spring.getValue());
//                break;
//            case 6:
//            case 7:
//            case 8:
//                System.out.println(Season.Summer.getValue());
//                break;
//            case 9:
//            case 10:
//            case 11:
//                System.out.println(Season.Fall.getValue());
//                break;
//            default:
//                System.out.println("Unknown season");
//        }
//        Scanner scanner = new Scanner(System.in);
//        String env = scanner.nextLine();
//        if (env.equals("google")) {
//            System.out.println(Url.Google.getValue());
//        } else if (env.equals("hillel")) {
//            System.out.println(Url.Hillel.getValue());
//        } else if (env.equals("opera")) {
//            System.out.println(Url.Opera.getValue());
//        } else if (env.equals("selenium")) {
//            System.out.println(Url.Selenium.getValue());
//        } else {
//            System.out.println("Unknown env");

        System.out.println(Calc.SUM.action(10, 12));
        System.out.println(Calc.SUBTRACT.action(10, 12));
        System.out.println(Calc.MULTIPLY.action(10, 12));
    }
}