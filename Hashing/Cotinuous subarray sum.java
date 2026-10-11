
import java.util.HashMap;

class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {

        HashMap<Long, Integer> map = new HashMap<>();

        long sum = 0;
        long divisor = Math.abs((long) k);

        map.put(0L, -1);

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            long rem;

            if (divisor == 0) {
                rem = sum;
            } else {
                rem = sum % divisor;
            }

            if (map.containsKey(rem)) {
                if (i - map.get(rem) >= 2) {
                    return true;
                }
            } else {
                map.put(rem, i);
            }
        }

        return false;
    }
}
