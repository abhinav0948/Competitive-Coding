import java.util.Arrays;

public class LeftShiftOfElements {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };

        // left shift

        int shift = 1, first = arr[0];

        for (int i = 0; i < shift; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[arr.length - 1] = first;
        }

        System.out.println(Arrays.toString(arr));

    }
}

// 1 2 3 4 5
// <---- 1
// 2 3 4 5 1
