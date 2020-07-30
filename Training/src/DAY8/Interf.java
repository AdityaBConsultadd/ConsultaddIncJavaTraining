package DAY8;
//interface name_of_the_interface{}
interface Vehicles{
    int tyres=0;
    String name="";
    void drive();

}
class Car implements Vehicles{

    @Override
    public void drive() {
        System.out.println("Hey this is a car");
    }
}
class Bike implements Vehicles{

    @Override
    public void drive() {
        System.out.println("Hey this is a bike");
    }
}

public class Interf {
    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();
        System.out.println(car.tyres);
        System.out.println(bike.tyres);
        bike.drive();
        car.drive();



    }
}
