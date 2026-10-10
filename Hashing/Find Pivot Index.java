
import java.util.HashMap;

class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(-1, 0);

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            map.put(i, sum);
        }

        for (int i = 0; i < nums.length; i++) {
            int leftSum = map.get(i - 1);
            int rightSum = map.get(nums.length - 1) - map.get(i);

            if (leftSum == rightSum) {
                return i;
            }
        }

        return -1;
    }
}
