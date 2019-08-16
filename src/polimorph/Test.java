package polimorph;

public class Test {
    public static void main(String[] args) {
        Animal dog=new Dog(); //upcasting (сужаем до предка. примитивы предка,методы потомка)
        dog.sleep();
        ((Dog)dog).bark();          //downcasting
        dog.sleep();
        int x=((Dog)dog).a;
        System.out.println(x);
        System.out.println(dog.a);
        System.out.println(dog.b);
            }
}


