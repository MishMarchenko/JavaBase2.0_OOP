package Inheritence;

public class C extends B{
    @Override
    public void print(){
        System.out.println("This is class C");
    }
    public void printing(){
        print();
        super.print();
    }
}
