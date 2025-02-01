
public class MajorityElement {

    public void majorityElement(int[] arr) {
        int count = 0;
        int majority = 0;
        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                majority = arr[i];
                count = 1;
            } else if (majority == arr[i]) {
                count++;
            } else {
                count--;
            }

            // Short cut of above code

            // majority = (count == 0) ? arr[i] : majority;
            // count = (majority == arr[i]) ? count++ : count--;

        }

        count = 0;

        for (int i : arr) {
            if (i == majority) {
                count++;
            }
        }

        if (count > arr.length / 2) {
            System.out.println("Majority element is " + majority);
        } else {
            System.out.println("No majority element");
        }

    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 2, 1, 1, 2, 3, 3, 2, 1, 1, 1, 1, 1, 1, 1, 1 };

        MajorityElement testing = new MajorityElement();
        testing.majorityElement(arr);
    }
}
