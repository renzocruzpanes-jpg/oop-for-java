import java.util.Scanner;

class Camera{
    String name;
    int age;
    String course;

    public Camera(String name, int age, String course){
    this.name = name;
    this.age = age;
    this.course = course;
    }
    public void displayInfo(){
    System.out.println("\nStudent Information:");
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Course: " + course);
    }
}
public class OOPSTUD{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter your course: ");
        String course = scanner.nextLine();

        Camera camera1 = new Camera(name, age, course);
        
        camera1.displayInfo();

        scanner.close();


        
        
        

    }
}

