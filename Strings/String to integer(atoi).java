class Solution {
    public int myAtoi(String s)
    {
        long result = 0;
        boolean isNegative = false;
        int mark = 0;

        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);

            if(ch == ' ')
            {
                continue;
            }
            else if(ch == '+')
            {

                mark = i+1;
                break;
            }
            else if(ch == '-')
            {

                isNegative = true;
                mark = i+1;
                break;
            }
            else if(Character.isDigit(ch))
            {

                mark = i;
                break;
            }
            else
            {
                return 0;
            }

        }



        int j=0;
        for(int i=mark;i<s.length();i++)
        {
            char ch = s.charAt(i);

            if(Character.isDigit(ch))
            {
                int digit = ch - '0';
                if (result > Integer.MAX_VALUE / 10 ||
                        (result == Integer.MAX_VALUE / 10 && digit > (isNegative ? 8 : 7))) {
                    return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                }

                result = result * 10 + digit;
                j++;
            }
            else
            {
                break;
            }
        }

        if(j==0)
        {
            return 0;
        }






        return (int) (isNegative ? -result : result);
    }
}