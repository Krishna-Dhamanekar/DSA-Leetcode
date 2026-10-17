class Solution {
    public int NthRoot(int N, int M)
    {

        int low=1;
        int high=M;

        while(low<=high)
        {
            int mid= low +(high-low)/2;
            int x=1;

            for(int i=1;i<=N;i++)
            {
                if (x > M / mid)
                {
                    x = M + 1;
                    break;
                }
                x=x*mid;
            }

            if(x==M)
            {
                return mid;
            }

            if(x < M)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }

        return -1;
    }
}
