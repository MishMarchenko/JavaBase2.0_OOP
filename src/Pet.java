public class Pet {
    private String name;
    private int age;

    public Pet(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Pet(){

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (!(o instanceof Pet)) return false;
        Pet pet = (Pet) o;
        return age == pet.age &&
                name.equals(pet.name);
    }

    @Override
    public String toString() {
        return "Pet:" +
                " name = '" + name + '\'' +
                ", age = " + age;
    }

    public void saySomething(){
        System.out.println("Some saying");
    }
}
