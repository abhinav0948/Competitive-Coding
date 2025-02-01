import java.util.HashSet;
import java.util.Set;

public class UniqueElements {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 1, 2 };

        Set<Integer> unique = new HashSet<Integer>();

        for (int elmnt : arr) {
            if (!unique.contains(elmnt)) {
                unique.add(elmnt);
            } else {
                unique.remove(elmnt);
            }
        }
        System.out.println("From Set");
        unique.forEach(System.out::println);

    }
}
