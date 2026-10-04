class Solution {
    public List<Integer> leaders(int[] nums) {

        List<Integer> list=new ArrayList<>();
        int max = Integer.MIN_VALUE;



        for(int i=nums.length-1;i>=0;i--)
        {
            if(nums[i]>max)
            {
                max=nums[i];
                list.add(nums[i]);

            }
        }

        return list;

    }
}