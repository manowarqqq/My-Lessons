
 interface Car {
    public void drive();
        }


 class Test {
    public static void main(String[] args) {
Car  car= new Car() {
    @Override
    public void drive() {
        System.out.println("car is driving");
    }
};
car.drive();
            }
        }



