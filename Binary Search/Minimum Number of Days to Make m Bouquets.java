class Solution {
    public int minDays(int[] bloomDay, int m, int k)
    {
        if(k*m > bloomDay.length)
        {
            return -1;
        }



        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for (int day : bloomDay) {
            high = high < day ? day : high;
            low = low > day ? day : low;
        }



        int ans=-1;
        while(low<=high)
        {
            int mid = low + (high - low)/2;

            int flower=0;
            int bucket = 0;


            for(int i=0;i<bloomDay.length;i++)
            {
                if(bloomDay[i]<=mid)
                {
                    flower++;
                }
                else
                {
                    bucket = bucket + flower/k;
                    flower=0;
                }

            }
            bucket = bucket + flower / k;



            if(bucket >= m)
            {
                ans=mid;
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