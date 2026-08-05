public class Methods{
    public void fullThrottle(){
        // Method implementation
        // Create a fullThrottle() methodz
        System.out.println("The car is go-go-go-gooing as fast as it can!");
    }   
    // Create a speed() method and add a parameter
    public void speed(int maxSpeed){
        System.out.println("Max speed is " + maxSpeed);
    }
    public void model(String modelName){
        System.out.println("The model of the car is " + modelName);
    }
    public void color(String colorName){
        System.out.println("The color of the car is " + colorName);
    }
    public void price(int priceValue){
        System.out.println("The price of the car is " + priceValue);
    }
    // Inside main, call the methods on the myCar object
    public static void main(String[] args) {
    Methods myCar = new Methods();  // Create a myCar object
    myCar.fullThrottle();           // Call the fullThrottle() method   
    myCar.speed(200);     // Call the speed() method    
    myCar.model("Sedan"); // Call the model() method
    myCar.color("Red");   // Call the color() method
    myCar.price(30000);   // Call the price() method
    }

}




//
//
// 
//
//
//
