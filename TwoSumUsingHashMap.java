import java.util.HashMap;

public class TwoSumUsingHashMap {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int trgt = target - nums[i];

            if (map.containsKey(trgt)) {
                return new int[] { map.get(trgt), i };
            }

            map.put(nums[i], i);
        }

        return null;
    }

    public static void main(String[] args) {
        TwoSumUsingHashMap twoSum = new TwoSumUsingHashMap();
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;

        int[] result = twoSum.twoSum(nums, target);

        if (result != null) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No two sum solution found");
        }
    }
}
