public class Car {
    String name = "Ford";
    String model = "Mustang";
    int year = 2026;
    double price = 130000.90;
    boolean isRunning = false;

    void start(){
        isRunning = true;
        System.out.println("You start the Engine of the car!!");
    }
    void stop (){
        isRunning = false;
        System.out.println("You stop the Engine of the car!!!");
    }
    void drive(){
        System.out.println("You drive the car " + name);
    }
    void brake(){
        System.out.println("You brake the car " + name);
    }
}
