class Solution {
    public int splitArray(int[] nums, int k)
    {

        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int num:nums)
        {
            if(num>max)
            {
                max=num;
            }
            sum=sum+num;
        }

        int low = max;
        int high = sum;

        while(low<=high)
        {
            int mid = low + (high-low)/2;
            int count = 1;
            int cursum=0;

            for(int num : nums)
            {
                if(cursum + num > mid)
                {
                    count++;
                    cursum=num;
                }
                else
                {
                    cursum = cursum + num;
                }
            }

            if(count>k)
            {
                low= mid+1;
            }
            else
            {
                high= mid -1;
            }

        }

        return low;
    }
}