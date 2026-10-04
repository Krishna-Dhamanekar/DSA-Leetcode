class Solution {
    public void sortColors(int[] nums) {

        int c0=0,c1=0,c2=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                c0++;
            }
            else if(nums[i]==1)
            {
                c1++;
            }
            else if(nums[i]==2)
            {
                c2++;
            }
        }

        int ind=0;

        for(int i=0;i<c0;i++)
        {
            nums[ind++]=0;
        }

        for(int i=0;i<c1;i++)
        {
            nums[ind++]=1;
        }
        for(int i=0;i<c2;i++)
        {
            nums[ind++]=2;
        }


    }
}