import java.util.HashMap;

class Solution {
    public int longestSubarray(int[] arr, int k) {
        int sum = 0;
        int max = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (map.containsKey(sum - k)) {
                int length = i - map.get(sum - k);
                max = Math.max(max, length);
            }

            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        return max;
    }
}