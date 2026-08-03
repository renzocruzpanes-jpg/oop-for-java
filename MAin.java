

public class MAin {
    public static void main(String[] args) {

        Car car = new Car();

        car.start();
        System.out.println(car.isRunning);
        car.drive();

        System.out.println(car.model);
        System.out.println(car.name);
        System.out.println(car.year);
        System.out.println(car.price);
        System.out.println(car.isRunning);

        car.stop();
        System.out.println(car.isRunning);
        car.brake();
        
    }
}
