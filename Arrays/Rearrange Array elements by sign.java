class Solution {
    public int[] rearrangeArray(int[] nums) {

        int i = 0;
        int j = 1;
        int k = 0;
        int[] arr=new int[nums.length];
        while(k < nums.length)
        {
            if(nums[k] > 0)
            {
                arr[i] = nums[k];
                i += 2;
            }
            else
            {
                arr[j] = nums[k];
                j += 2;
            }
            k++;
        }
        return arr;
    }
}