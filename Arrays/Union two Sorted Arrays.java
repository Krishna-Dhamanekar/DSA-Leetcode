class Solution {
    public int[] unionArray(int[] nums1, int[] nums2)
    {


        int m=nums1.length;
        int n=nums2.length;

        int[] union=new int[m+n];
        int k=0;

        int n1=0;
        int n2=0;


        while(n1<m && n2 < n)
        {

            if(nums1[n1]<nums2[n2])
            {
                union[k++] = nums1[n1];
                n1++;
                while(n1<m && nums1[n1]==nums1[n1-1])n1++;
            }
            else if(nums1[n1]>nums2[n2])
            {
                union[k++]=nums2[n2];
                n2++;
                while(n2<n && nums2[n2]==nums2[n2-1])n2++;
            }
            else if(nums1[n1]==nums2[n2])
            {
                union[k++]=nums2[n2];
                n2++;
                n1++;
                while(n1<m && nums1[n1]==nums1[n1-1])n1++;
                while(n2<n && nums2[n2]==nums2[n2-1])n2++;
            }
        }

        while(n1 < m) {
            union[k++] = nums1[n1];
            n1++;
            while(n1 < m && nums1[n1] == nums1[n1-1])
                n1++;
        }

        while(n2 < n) {
            union[k++] = nums2[n2];
            n2++;
            while(n2 < n && nums2[n2] == nums2[n2-1])
                n2++;
        }


        return Arrays.copyOf(union, k);

    }
}