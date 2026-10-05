class Solution {
    public int maxProduct(int[] nums)
    {
        int answer = nums[0];
        int current_max = 1;
        int current_min = 1;
        int new_max=Integer.MIN_VALUE;
        int new_min=Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++)
        {
            int a = nums[i];
            int b=nums[i]*current_max;
            int c=nums[i]*current_min;


            new_max = Math.max(a, Math.max(b, c));
            new_min = Math.min(a, Math.min(b, c));
            current_max = new_max;
            current_min = new_min;
            answer = Math.max(answer, new_max);
        }

        return answer;

    }
}