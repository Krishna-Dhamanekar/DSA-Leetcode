class Solution {
    public List<List<Integer>> generate(int numRows)
    {
        List<List<Integer>> list=new ArrayList<>();




        for(int i=1;i<=numRows;i++)
        {
            List<Integer> temp = new ArrayList<>();
            long res=1;
            temp.add((int)1);
            for(int j=1;j<i;j++)
            {

                res=res*(i-j)/j;
                temp.add((int)res);
            }

            list.add(temp);
        }

        return list;
    }
}