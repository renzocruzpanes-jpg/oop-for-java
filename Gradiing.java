import java.util.Scanner;

public class Gradiing{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your grade: ");
        int grade = scanner.nextInt();

        if (grade >= 90) {
            System.out.println("Excellent!!");
        }
        else if (grade >= 85) {
            System.out.println("Very Good!!");
        }
        else if (grade >= 70) {
            System.out.println("Good!!");
        }
        else if (grade >= 60) {
            System.out.println("Average!!");
        }
        else {
            System.out.println("Fail!!");
        }
        scanner.close();

    }
}