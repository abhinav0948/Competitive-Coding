import java.util.Scanner;

public class PrimeCheck {

    Boolean isPrime(int number) {
        int count = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % 2 == 0) {
                count++;
            }
        }

        if (count <= 1) {
            return true;
        } else {
            return false;
        }
    }

    public void primeChecker(int number) {

        if (isPrime(number)) {
            System.out.println("prime");
        } else {
            System.out.println("Composite");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number : ");

        int number = scanner.nextInt();

        PrimeCheck primeCheck = new PrimeCheck();
        primeCheck.primeChecker(number);

    }

}
