// Declares a public class named Modifiers
public class Modifiers {

    // PUBLIC ACCESS MODIFIER
    // Can be accessed from other classes
    public String name = "Renzo";

    // PRIVATE ACCESS MODIFIER
    // Can only be accessed directly inside the Modifiers class
    private int age = 21;

    // PROTECTED ACCESS MODIFIER
    // Can be accessed within the same package
    // It can also be accessed by subclasses
    protected String course = "Computer Science";

    // DEFAULT ACCESS MODIFIER
    // No modifier is written before the variable
    // Can only be accessed by classes in the same package
    String school = "Batangas State University";


    // PUBLIC METHOD
    // Can be called from other classes
    public void displayName() {
        System.out.println("Name: " + name);
    }

    // PRIVATE METHOD
    // Can only be called inside the Modifiers class
    private void displayAge() {
        System.out.println("Age: " + age);
    }

} // End of Modifiers class


// Declares a class named Main
class Main {

    // Main method
    // This is where the program starts executing
    public static void main(String[] args) {

        // Creates an object of the Modifiers class
        Modifiers men = new Modifiers();

        // Accesses the public variable "name"
        // This works because name is public
        System.out.println(men.name);

        // Calls the public displayName() method
        // This works because the method is public
        men.displayName();

        // Accesses the protected variable "course"
        // This can work when Main is in the same package
        System.out.println(men.course);

        // Accesses the default variable "school"
        // This can work when Main is in the same package
        System.out.println(men.school);

        // This will cause an ERROR
        // age is private and cannot be directly accessed from Main
        // System.out.println(men.age);

        // This will also cause an ERROR
        // displayAge() is private
        // men.displayAge();

    } // End of main method

} // End of Main class





// The public keyword is an access modifier, meaning that it is used to set the access level for classes, attributes, methods and constructors.
//  We divide modifiers into two groups: Access Modifiers - controls the access level. Non-Access Modifiers - do not control access level, but provides other functionality
// public - a public park, everyone can enter 
// private - your house key, only you can use it//
