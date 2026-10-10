class Solution {
    public int subarraysWithXorK(int[] nums, int k)
    {

        int count=0;
        int xor = 0;

        HashMap<Integer,Integer> map=new HashMap<>();

        map.put(0,1);

        for(int i=0;i<nums.length;i++)
        {
            xor=xor^nums[i];

            int x=xor^k;

            if(map.containsKey(x))
            {
                count=count+map.get(x);
            }

            map.put(xor,map.getOrDefault(xor,0)+1);

        }

        return count;
    }
}