import java.util.Scanner;

class Constructor{
    String name;
    int math;
    int science;
    double average;

    Constructor(String name, int math, int science, double average){
        this.name = name;
        this.math = math;
        this.science = science;
        this.average = average;

    }
    public void displayInfo(){
        System.out.println("\nStudent Grade:");
        System.out.println("Name: " + name);
        System.out.println("Math grade: " + math);
        System.out.println("Sciece grade: " + science);
        System.out.println("Average: " + average);
    }
}
public class Science{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your Math grade: ");
        int math = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter your Science grade: ");
        int science = scanner.nextInt();

        scanner.nextLine();

        double average = (math + science) / 2f;

        Constructor constructor = new Constructor(name, math, science, average);

        constructor.displayInfo();

        scanner.close();
    }
}