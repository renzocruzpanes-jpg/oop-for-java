public class Keyword{
    int model;
    String car;

public Keyword(int model, String car){  // Constructor with two parameters
    this.model = model;
    this.car = car;
}
public void display(){
    System.out.println(model + " " + car); // Method to print car information
}
    public static void main(String[] args){
    Keyword myTsikot = new Keyword(2026, "Honda Civic");
    Keyword myTsikot1 = new Keyword(2020, "Toyota Corolla");

    myTsikot.display();
    myTsikot1.display();    
    }
}










// The this keyword in Java refers to the current object in a method or constructor.
// The this keyword is often used to avoid confusion when class attributes have the same name as method or constructor parameters.
// Tip: Think of this.x = x; as: "this.x (the class variable) gets the value of x (the parameter)."
// Without this, the code above x = x; would set the parameter x equal to itself, and the class variable would stay uninitialized (0).
//
