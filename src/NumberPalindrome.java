public class NumberPalindrome
{
    public static boolean isPalindrome(int number)
    {
        if(number == 10)
        {
            return false;
        }

        if(number <0)
        {
            number *= -1;
        }

        int same = number;
        int reverse = 0;
        while(reverse < number)
        {
            int lastDigit = same % 10;
            reverse += lastDigit;
            same /= 10;

            if(reverse < number)
            {
                reverse *= 10;
            }
        }

        if(reverse == number)
        {
            return true;
        }
        return false;

    }
}
