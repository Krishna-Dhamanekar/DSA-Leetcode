class Solution {

    public int findMedian(int[][] matrix)
    {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int k = (matrix.length*matrix[0].length)/2;

        for(int i=0;i<matrix.length;i++)
        {
            if(matrix[i][0]<min)
            {
                min = matrix[i][0];
            }

            if(matrix[i][matrix[0].length-1]>max)
            {
                max=matrix[i][matrix[0].length-1];
            }
        }

        int low = min;
        int high = max;

        while(low<=high)
        {
            int mid = low + (high-low)/2;

            int minnum = NumofElemnts(matrix,mid);

            if(minnum <=k)
            {
                low = mid + 1;
            }
            else
            {
                high = mid -1;
            }


        }

        return low;
    }


    public int NumofElemnts(int[][] matrix, int mid)
    {
        int count=0;
        for(int i =0;i< matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {

                if(matrix[i][j] <= mid)
                {
                    count++;
                }
            }

        }

        return count;
    }

}



