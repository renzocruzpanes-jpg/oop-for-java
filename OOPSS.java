public class OOPSS {

    public static void main(String[] args){
        int [] numbers = {85, 75, 70, 90, 95};

        for (int number : numbers) {
            if (number >= 90){
                System.out.println("You are Excellent!!");
            }
            else if (number >= 80){
                System.out.println("You are Great!!");
            }
            else if (number >= 75){
                System.out.println("You are Good!!");
            }
            else {
                System.out.println("You failed!!");
            }
        }
    }
}  