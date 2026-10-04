class Solution {
    public int missingNumber(int[] nums) {
        int s1=0,s2=0;
        int i,j;
        for(i=0;i<=nums.length;i++)
        {
            s1=s1+i;
        }
        for(j=0;j<nums.length;j++)
        {
            s2=s2+nums[j];
        }
        return s1-s2;
    }
}