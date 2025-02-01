import java.util.Scanner;

public class FibSeries {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n < 0 || n > 30) {
            System.out.println("Please enter a number between 0 and 30.");
        } else {
            int result = fibonacci(n);
            System.out.println(result);
        }
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int firstTerm = 0;
        int secondTerm = 1;
        int nextTerm = 0;

        for (int i = 2; i <= n; i++) {
            nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

        return nextTerm;
    }
}
