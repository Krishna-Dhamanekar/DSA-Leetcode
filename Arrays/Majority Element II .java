class Solution {
    public List<Integer> majorityElement(int[] nums)
    {
        int cand1 = Integer.MIN_VALUE;
        int cand2 = Integer.MIN_VALUE;
        int count1=0,count2=0;
        List<Integer> list = new ArrayList<>();

        for(int num:nums)
        {
            if(count1==0 && num!=cand2)
            {
                cand1=num;
                count1++;
            }
            else if(count2==0 && num!=cand1)
            {
                cand2=num;
                count2++;
            }
            else if(num == cand1)
            {
                count1++;
            }
            else if(num == cand2)
            {
                count2++;
            }
            else
            {
                count1--;
                count2--;
            }
        }


        int f1=0,f2=0;

        for(int num:nums)
        {
            if(num == cand1)
            {
                f1++;
            }
            if(num == cand2)
            {
                f2++;
            }
        }

        if (f1 > nums.length / 3)
        {
            list.add(cand1);
        }

        if (f2 > nums.length / 3)
        {
            list.add(cand2);
        }

        return list;

    }
}

