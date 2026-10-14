class Solution {
    public int countOccurrences(int[] arr, int target)
    {

        int low=0;
        int high = arr.length-1;

        int start=-1;

        while(low<=high)
        {
            int mid = low + (high - low) / 2;

            if(arr[mid]==target)
            {
                start=mid;
                high=mid-1;
            }
            else if(arr[mid]<target)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }

        low=0;
        high=arr.length-1;
        int end=-1;
        while(low<=high)
        {
            int mid = low + (high - low) / 2;

            if(arr[mid]==target)
            {
                end=mid;
                low=mid+1;
            }
            else if(arr[mid]<target)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        if(start==-1)
        {
            return 0;
        }

        int count=end-start+1;

        return count;
    }
}
