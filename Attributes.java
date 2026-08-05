public class Attributes {
    int x = 5;
    String name = "joevan balsalani";
}
class Second{
    int y = 13;
    String lane = "sampaloc";

    public static void main(String[] args) {
       Attributes myObj = new Attributes();
       Second myObj2 = new Second();

       myObj.name = "Christian sabolero";
       myObj.x = 25; // x is now 25
      
       myObj2.y = 22;
       myObj2.lane = "batangas";
      
       System.out.println(myObj.x);
       System.out.println(myObj.name);
       System.out.println(myObj2.y);
       System.out.println(myObj2.lane);
    }
}



// Java Class Attributes
// In Java, variables declared inside a class are called "attributes" You can also say that attributes are variables that belong to a class:
//You can access attributes by creating an object of the class, and by using the dot syntax (.):
//The following example will create an object of the Main class, with the name myObj. We use the x attribute on the object to print its value:
//
//
// 
//
//
//
