import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String input) {
        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }

            else {
                if (stack.isEmpty())
                    return false;
                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string of parentheses: ");
        String input = scanner.nextLine();

        if (isValid(input)) {
            System.out.println("Valid parentheses");
        } else {
            System.out.println("Invalid parentheses");
        }

    }
}
