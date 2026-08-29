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
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Course: " + course);
    }
}
public class Student{
    public static void main(String[] args){
        Camera camera1 = new Camera("Renzo", 18, "BS Computer Science");
        
        camera1.displayInfo();

    }
}

