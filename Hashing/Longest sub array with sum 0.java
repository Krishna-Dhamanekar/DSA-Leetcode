import java.util.HashMap;

class Solution {
    public int maxLength(int arr[]) {
        int sum = 0;
        int max = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (map.containsKey(sum)) {
                int length = i - map.get(sum);
                max = Math.max(max, length);
            } else {
                map.put(sum, i);
            }
        }

        return max;
    }
}