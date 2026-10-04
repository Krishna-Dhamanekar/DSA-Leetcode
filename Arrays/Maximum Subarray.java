class Solution {
    public int maxSubArray(int[] nums) {

        int cs=0;
        int maxsum = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            cs=nums[i]+cs;
            if(cs>maxsum)
            {
                maxsum=cs;
            }
            if(cs<0)
            {
                cs=0;

            }
        }

        return maxsum;
    }
}