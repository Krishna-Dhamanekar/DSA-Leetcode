class Solution {
    public int romanToInt(String s)
    {
        int num =0;
        int prev = 0;

        for(int i=s.length()-1;i>=0;i--)
        {
            char ch = s.charAt(i);
            int n=number(ch);

            if(number(ch) >= prev)
            {
                num = num + n;
            }
            else
            {
                num = num - n;
            }

            prev = n;

        }
        return num;
    }

    public int number(char ch)
    {

        int n = 0;

        switch(ch)
        {
            case 'I':n=1;
                break;
            case 'V':n=5;
                break;
            case 'X':n=10;
                break;
            case 'L':n=50;
                break;
            case 'C':n=100;
                break;
            case 'D':n=500;
                break;
            case 'M':n=1000;
                break;
            default:n=0;
                break;
        }
        return n;
    }
}