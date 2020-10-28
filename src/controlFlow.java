import java.util.Scanner;

public class controlFlow {

    public static void main(String[] args) {
        System.out.println("Number");
        Scanner scanner = new Scanner(System.in);
        boolean repeat = true;


        while (repeat) {

            int inputNum = scanner.nextInt();

            if (inputNum < 5) {
                System.out.println("<5");
                repeat = false;
            } else {
                System.out.println(">=5");
            }
        }
    }

}
