public class Car {
    private String name;
    private int doors;
    public Car(){
    }
    public Car(String name, int doors){
        this.name = name;
        this.doors = doors;
    }
    public String getName(){
        return name;
    }
    public int getDoors(){
        return doors;
    }
    public String setName(String name){
        return this.name = name;
    }
    public int setDoors(int doors){
        return this.doors = doors;
    }
    public String toString(){
        return "Car:"+" name = "+name+", doors = "+doors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return name.equals(car.name);
    }
}
