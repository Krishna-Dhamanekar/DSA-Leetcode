class Solution {
    int count=0;

    public int reversePairs(int[] nums)
    {
        mergesort(nums);
        return count;
    }

    public void mergesort(int[] arr)
    {
        if(arr.length>1)
        {
            int mid=arr.length/2;
            int[] left=new int[mid];
            int[] right=new int[arr.length-mid];

            left=Arrays.copyOfRange(arr,0,mid);
            right=Arrays.copyOfRange(arr,mid,arr.length);

            mergesort(left);
            mergesort(right);
            merge(left,right,arr);

        }
    }

    public void merge(int[] left,int[] right,int[] arr)
    {
        int i,j=0,k=0;
        int p=left.length;
        int q=right.length;


        for( i = 0; i < p; i++)
        {
            while(j < q && left[i] > 2L * right[j])
            {
                j++;
            }

            count += j;
        }

        i = 0;
        j = 0;
        k = 0;

        while(i<p&&j<q)
        {


            if(left[i]<right[j])
            {
                arr[k++]=left[i++];
            }
            else
            {
                arr[k++]=right[j++];
            }
        }
        while(i<p)
        {
            arr[k++]=left[i++];
        }
        while(j<q)
        {
            arr[k++]=right[j++];
        }
    }
}