import java.util.Scanner;

class CountDigits {
    public int countDigits(int num) {
        return String.valueOf(num).length();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        CountDigits obj = new CountDigits();
        System.out.println("Digit count: " + obj.countDigits(number));
    }
}
