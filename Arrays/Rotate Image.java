class Solution {
    public void rotate(int[][] matrix) {

        int n=matrix.length;
        int temp;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        temp=0;
        int j,k;
        for(int i=0;i<n;i++)
        {
            for(j=0,k=n-1;j<k;j++,k--)
            {
                temp=matrix[i][j];
                matrix[i][j]=matrix[i][k];
                matrix[i][k]=temp;
            }
        }
    }
}
