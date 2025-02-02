public class ReverseString {
    public String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        String input = "hello";
        System.out.println("Reversed String: " + reverseString.reverseString(input));
    }
}