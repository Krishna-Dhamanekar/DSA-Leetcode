class Solution {
    public int kthElement(int[] a, int[] b, int k)
    {

        if(a.length>b.length)
        {
            return kthElement(b,a,k);
        }


        int  m = a.length;
        int n =b.length;

        int low = Math.max(0, k - n);
        int high = Math.min(k, m);

        while(low<=high)
        {
            int mid1 = low + (high-low)/2;
            int mid2 = k - mid1;

            int left1 = mid1 ==0 ? Integer.MIN_VALUE:a[mid1-1];
            int left2 = mid2 ==0 ? Integer.MIN_VALUE:b[mid2-1];
            int right1 = mid1== a.length?Integer.MAX_VALUE:a[mid1];
            int right2 = mid2==b.length? Integer.MAX_VALUE:b[mid2];

            if(left1<=right2 && left2 <=right1)
            {
                return Math.max(left1,left2);
            }
            else if(left1 > right2)
            {
                high = mid1 -1;
            }
            else
            {
                low = mid1+1;
            }
        }

        return -1;
    }
}
