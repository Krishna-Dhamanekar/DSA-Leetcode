class Solution {
    public void nextPermutation(int[] nums) {

        int n = nums.length;
        int pivot = -1;

        // 1. Find pivot
        for (int i = n - 1; i > 0; i--) {
            if (nums[i - 1] < nums[i]) {
                pivot = i - 1;
                break;
            }
        }

        // 2. If no pivot, reverse the entire array
        if (pivot == -1) {
            int left = 0;
            int right = n - 1;

            while (left < right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;

                left++;
                right--;
            }

            return;
        }

        // 3. Find the smallest number greater than pivot
        int x = n - 1;

        while (nums[x] <= nums[pivot])
        {
            x--;
        }

        // 4. Swap pivot and x
        int temp = nums[pivot];
        nums[pivot] = nums[x];
        nums[x] = temp;

        // 5. Reverse the suffix
        int left = pivot + 1;
        int right = n - 1;

        while (left < right) {
            int temp1 = nums[left];
            nums[left] = nums[right];
            nums[right] = temp1;

            left++;
            right--;
        }
    }
}