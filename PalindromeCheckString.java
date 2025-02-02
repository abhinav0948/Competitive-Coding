import java.util.Scanner;

class PalindromeCheckString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.next();

        int left = 0, right = str.length() - 1;
        boolean isPalindrome = true;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.println("\"" + str + "\" is a Palindrome.");
        } else {
            System.out.println("\"" + str + "\" is NOT a Palindrome.");
        }

        scanner.close();
    }
}
