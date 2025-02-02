import java.util.*;

public class LongestSubstringWithoutRepeats {
    public int lengthOfLongestSubstring(String str) {
        Set<Character> set = new HashSet<>();
        int left = 0, maxLen = 0;
        for (int right = 0; right < str.length(); right++) {
            while (set.contains(str.charAt(right))) {
                set.remove(str.charAt(left));
                left++;
            }
            set.add(str.charAt(right));
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        LongestSubstringWithoutRepeats longestSubstring = new LongestSubstringWithoutRepeats();
        String str = "abcabcbb";
        System.out.println("Longest Substring Length: " + longestSubstring.lengthOfLongestSubstring(str));
    }
}