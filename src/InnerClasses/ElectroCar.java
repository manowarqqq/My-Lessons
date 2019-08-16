package InnerClasses;

public class ElectroCar {
    private int id;
    private static int num;

    public ElectroCar() {

    }

    //вложенный нестатический класс (имеет доступ к полям объекта)
    private class Motor {
        public void startMotor() {
            System.out.println(id+" Motor is starting");
        }
    }

    //вложенный статический класс(нет доступа к  полям объекта;евсть доступ к статическим полям)
    //создание объекта (ElectroCar.Battery battery=new Battery())
    public static  class Batery {
        public void charge() {
            System.out.println(num+"charging");
        }
    }


public ElectroCar(int id) {
        this.id=id;
}

public void start() {
        Motor motor=new Motor();
        motor.startMotor();
    System.out.println(id+" starting");
    //Вложенный класс в методе
    class SomeClass {
        public void SomeMethod() {
            System.out.println();
        }
    }
}

}
