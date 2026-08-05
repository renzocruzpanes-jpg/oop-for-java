public class Main {
    int x = 5;
    double f = 10.5;
}   

class Second {
    String name = "Renxo";
    int z = 10;

    public static void main(String[] args) {
       Main myObj1 = new Main();
       Main myObj2 = new Main();
       Second myObj3 = new Second();
       
       System.out.println(myObj1.x);
       System.out.println(myObj2.x);
       System.out.println(myObj3.name);
       System.out.println(myObj1.f);
       System.out.println(myObj3.z);
    }
}




// Create a Class To create a class, use the keyword class. 
// In this example, we create a class named "Main" with a variable x://
//Create an Object
//In Java, an object is created from a class. After defining a class, you can create objects from it using the new keyword:
//Using Multiple Classes
//You can also create an object of a class and access it in another class. This is often used for better organization of classes
//(one class has all the attributes and methods, while the other class holds the main() method (code to be executed)).  
//
//
//
