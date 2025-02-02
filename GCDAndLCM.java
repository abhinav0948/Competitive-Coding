import java.util.Scanner;

class GCDAndLCM {
    public int findGCD(int a, int b) {
        return b == 0 ? a : findGCD(b, a % b);
    }

    public int findLCM(int a, int b) {
        return (a * b) / findGCD(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        GCDAndLCM obj = new GCDAndLCM();
        System.out.println("GCD: " + obj.findGCD(a, b));
        System.out.println("LCM: " + obj.findLCM(a, b));
    }
}
