//Name: Prabhav P.
//Period: 1A

import java.util.*;

public class MethodsPractice
{
    public static char randomLetter()
    {
        Random randomLetterObject = new Random();
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        int letterNum = randomLetterObject.nextInt(25);
        return alphabet[letterNum];
    }
    
    public static String numberToMonth(int monthNum)
    {
        String[] calendar = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        return calendar[monthNum - 1];
    }
    
    public static void oddsOrEvens(int number)
    {
        if ((number % 2) == 0)
        {
            System.out.println(number+" is an even number.");
        }
        else if ((number % 2) == 1)
        {
            System.out.println(number+" is an odd number.");
        }
    }
    
    public static void main(String[] args)
    {
        System.out.println(randomLetter());
        System.out.println(numberToMonth(4));
        oddsOrEvens(456);
    }
}