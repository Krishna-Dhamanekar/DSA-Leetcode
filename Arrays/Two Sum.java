class Solution {
    public int[] twoSum(int[] nums, int target)
    {
        HashMap<Integer,Integer> map=new HashMap<>();


        for(int i=0;i<nums.length;i++)
        {
            int cur = nums[i];
            int needed = target-cur;
            if(map.containsKey(needed))
            {
                return new int[]{map.get(needed),i};
            }
            else
            {
                map.put(cur,i);
            }
        }
        return new int[]{};
    }
}