public class ExpandString {
    public static void main(String[] args) {

        String str = "a1b4c7d2";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            if ((i + 1) < str.length() && Character.isDigit(str.charAt(i + 1))) {
                int num = Character.getNumericValue(str.charAt(i + 1));
                for (int j = 1; j <= num; j++) {
                    result.append(str.charAt(i));
                }
                i++;
            } else {
                result.append(str.charAt(i));
            }
        }
        System.out.println(result);
    }
}
