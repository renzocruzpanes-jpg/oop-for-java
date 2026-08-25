import java.util.Scanner;

public class loopingss {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int evenCount = 0;
        int oddCount = 0;
        int totalSum = 0;

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0){
                evenCount++;
            }
            else{
                oddCount++;
            }

            totalSum += i;
        }
        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
        System.out.println("Total sum: " + totalSum);
        scanner.close();

    }
}