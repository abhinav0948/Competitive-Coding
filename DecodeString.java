import java.util.*;

public class DecodeString {
    public String decodeString(String str) {
        Stack<Integer> countStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();
        String currentString = "";
        int currentCount = 0;
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                currentCount = currentCount * 10 + (c - '0');
            } else if (c == '[') {
                countStack.push(currentCount);
                stringStack.push(currentString);
                currentCount = 0;
                currentString = "";
            } else if (c == ']') {
                int count = countStack.pop();
                StringBuilder temp = new StringBuilder(stringStack.pop());
                for (int i = 0; i < count; i++) {
                    temp.append(currentString);
                }
                currentString = temp.toString();
            } else {
                currentString += c;
            }
        }
        return currentString;
    }

    public static void main(String[] args) {
        DecodeString decodeString = new DecodeString();
        String str = "3[a2[c]]";
        System.out.println("Decoded String: " + decodeString.decodeString(str));
    }
}
