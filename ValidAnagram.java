import java.util.Arrays;

public class ValidAnagram {
    public boolean isAnagram(String str, String str1) {
        if (str.length() != str1.length())
            return false;
        char[] ch = str.toCharArray();
        char[] ch1 = str1.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch1);
        return Arrays.equals(ch, ch1);
    }

    public static void main(String[] args) {
        ValidAnagram validAnagram = new ValidAnagram();
        String str = "anagram", str1 = "nagaram";
        System.out.println("Is Anagram: " + validAnagram.isAnagram(str, str1));
    }
}