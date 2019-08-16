package Array;

import java.util.ArrayList;
import java.util.List;

public class WildCard {
    public static void main(String[] args) {
        List<Animal> ListOfAnimal = new ArrayList<>();
        ListOfAnimal.add(new Animal());
        ListOfAnimal.add(new Animal());
        ListOfAnimal.add(new Animal());

        List<Dog> ListOfDog=new ArrayList<>();
        ListOfDog.add(new Dog());
        ListOfDog.add(new Dog());
        ListOfDog.add(new Dog());



        test(ListOfAnimal);
        test(ListOfDog);
/**
 Object
 Animal
 Dog
 **/

    }
    public static void test(List<? extends Animal> list) {     //?-любой (Object);? extends -любой кто наследуется и предок; ? super- Предок и выше
        for (Animal d : list) {
            System.out.println(d);
        }
    }
}
