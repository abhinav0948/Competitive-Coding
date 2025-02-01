import java.util.Arrays;

public class RightShiftOfElements {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };

        // right shift

        int shift = 1, last = arr[arr.length - 1];

        for (int i = 0; i < shift; i++) {
            for (int j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = last;
        }

        System.out.println(Arrays.toString(arr));

    }
}

// 1 2 3 4 5
// ----> 1
// 5 1 2 3 4