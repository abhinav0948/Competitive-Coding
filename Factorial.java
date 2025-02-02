import java.util.Scanner;

class Factorial {
    public long findFactorial(int num) {
        return (num == 0 || num == 1) ? 1 : num * findFactorial(num - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        Factorial obj = new Factorial();
        System.out.println("Factorial: " + obj.findFactorial(number));
    }
}
