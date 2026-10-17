class Solution {
    public int smallestDivisor(int[] nums, int threshold)
    {

        int low=1;
        int high=Arrays.stream(nums).max().getAsInt();
        int ans=Arrays.stream(nums).max().getAsInt();

        while(low<=high)
        {
            int mid=low + (high - low)/2;

            int sum=0;

            for(int i=0;i<nums.length;i++)
            {
                sum=sum + (int)Math.ceil((float)nums[i]/mid);
            }

            if(sum<=threshold)
            {
                if(mid<ans)
                {
                    ans=mid;
                }
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }

        }


        return ans;
    }
}
