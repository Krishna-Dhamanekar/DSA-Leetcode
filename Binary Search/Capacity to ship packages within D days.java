
class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int min = Integer.MIN_VALUE;
        int sum = 0;

        for (int weight : weights) {
            min = min < weight ? weight : min;
            sum += weight;
        }

        int ans = Integer.MAX_VALUE;
        int low = min;
        int high = sum;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int day = 1;
            int cap = 0;

            for (int j = 0; j < weights.length; j++) {
                if (weights[j] > mid) {
                    day = days + 1;
                    break;
                }

                if (cap + weights[j] <= mid) {
                    cap += weights[j];
                } else {
                    day++;
                    cap = weights[j];
                }
            }

            if (day > days) {
                low = mid + 1;
            } else {
                ans = mid;
                high = mid - 1;
            }
        }

        return ans;
    }
}
