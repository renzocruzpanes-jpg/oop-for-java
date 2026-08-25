import java.util.Scanner;

public class OOPSS {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your grade: ");
        int grade = scanner.nextInt();

        if (grade >= 75) {
            System.out.println("Congratulations, " + name + "! You passed!");
        }
        else if (grade <= 74) {
            System.out.println(name + ", you need to take removal!! ");
        }
        else{
            System.out.println(name + ", you failed the subject!! ");
        }
        scanner.close();

    }
}