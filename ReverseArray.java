import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };

        int l = 0, r = arr.length - 1, temp;

        System.out.println(Arrays.toString(arr));

        while (l < arr.length / 2) {
            temp = 0;
            temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }

        System.out.println(Arrays.toString(arr));

    }
}
