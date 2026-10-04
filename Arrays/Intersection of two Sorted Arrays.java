class Solution {
    public int[] intersectionArray(int[] nums1, int[] nums2)
    {

        int m=nums1.length;
        int n=nums2.length;
        int[] result = new int[Math.min(m, n)];

        int k=0;
        int n1=0;
        int n2=0;
        while(n1<m && n2 < n)
        {
            if(nums1[n1]==nums2[n2])
            {
                result[k++]=nums1[n1];
                n1++;
                n2++;
            }
            else if(nums1[n1]<nums2[n2])
            {
                n1++;
            }
            else if(nums1[n1]>nums2[n2])
            {
                n2++;
            }
        }
        return Arrays.copyOf(result,k);

    }
}