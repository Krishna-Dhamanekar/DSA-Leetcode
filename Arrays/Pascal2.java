class Solution {
    public int pascalTriangleI(int r, int c)
    {
        int res=1;
        int n=r-1;
        for(int i=1;i<=c-1;i++)
        {
            res=res*(n-i+1)/i;
        }
        return res;

    }
}