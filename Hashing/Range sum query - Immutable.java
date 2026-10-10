class NumArray {

    int[] nums;
    HashMap<Integer,Integer> map=new HashMap<>();

    public NumArray(int[] nums)
    {
        this.nums=nums;
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
            map.put(i,sum);
        }
    }

    public int sumRange(int left, int right)
    {
        if (left == 0)
        {
            return map.get(right);
        }
        int sum= map.get(right) - map.get(left-1);
        return sum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */