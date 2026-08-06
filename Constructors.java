public class Constructors{
    int x;   // Create a class attribute
    int z;
    String name;
    double price;
    String pane;
public Constructors(String lane){
    pane = lane;
}    
public Constructors(int y){   //  the following example adds an int y parameter to the constructor. Inside the constructor we set
    x = 5;   // Set the initial value for the class attribute x  
    z = y;
    name = "Tsukii";
    price = 1000.5;
}

public static void main(String[] args){
    Constructors myBaby = new Constructors("Renzo");
    Constructors myObj = new Constructors(10);   // Create an object of class Main (This will call the constructor)
    System.out.println(myObj.x);       //printing
    System.out.println(myObj.z);
    System.out.println(myObj.name);
    System.out.println(myObj.price);
    System.out.println(myBaby.pane);
}
}


//Note that the constructor name must match the class name, and it cannot have a return type (like void).
//Also note that the constructor is called when the object is created.
//All classes have constructors by default: if you do not create a class constructor yourself, 
//Java creates one for you. However, then you are not able to set initial values for object attributes.
//
// 
//
//
//
