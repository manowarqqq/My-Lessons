package polimorph;

public class Dog extends Animal {
    int a=100;
public Dog() {
    System.out.println("konstr Dog ");
}
    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
            }
public void bark() {
    System.out.println("dog is barking");
}
}
