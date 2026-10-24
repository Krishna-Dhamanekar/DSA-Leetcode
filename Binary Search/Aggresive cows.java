class Solution {
    public int aggressiveCows(int[] nums, int k)
    {

        Arrays.sort(nums);
        int max = nums[nums.length-1]-nums[0];
        int ans =0;

        int low = 1;
        int high = max;

        while(low <= high)
        {
            int mid = low + (high - low)/2;
            int cows = 1;
            int last= nums[0];

            for(int j=1;j<=nums.length-1;j++)
            {
                if(nums[j]-last>=mid)
                {
                    cows++;
                    last=nums[j];
                }


            }

            if(cows < k)
            {
                high = mid - 1;
            }
            else
            {
                ans=mid;
                low = mid+1 ;
            }



        }

        return  ans;
    }
}
