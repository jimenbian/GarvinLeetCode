package No7.ReverseInteger;

public class Solution {
    public int reverse(int x) {
        int sum = 0;
        while (Math.abs(x) != 0)
        {
            if(Math.abs(sum) > Integer.MAX_VALUE / 10)
            {
                return 0;
            }
            sum = sum * 10 + x % 10;
            x = x / 10;
        }

        return sum;
    }
}