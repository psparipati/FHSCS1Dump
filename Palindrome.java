//Name: Prabhav P.
//Period: 1A

import java.util.*;
import java.lang.String;

public class Palindrome
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        
        //challenge 1
        System.out.print("Enter a string --> ");
        String str = console.next();
        System.out.println(str.length());
        
        //challenge 2
        System.out.print("Enter a string --> ");
        str = console.next();
        str = str.substring(1, str.length());
        System.out.println(str);
        
        //challenge 3
        System.out.print("Enter a string --> ");
        str = console.next();
        str = str.substring(0, str.length() - 1);
        System.out.println(str);
        
        //challenge 4
        System.out.println("Enter two strings");
        System.out.print("-->");
        String wordOne = console.next();
        System.out.print("-->");
        String wordTwo = console.next();
        if (wordOne.length() == wordTwo.length())
        {
            System.out.println("The strings are the same length.");
        }
        else
        {
            if (wordOne.length() > wordTwo.length())
            {
                System.out.println(wordTwo+wordOne+wordTwo);
            }
            else if (wordOne.length() < wordTwo.length())
            {
                System.out.println(wordOne+wordTwo+wordOne);
            }
        }
        
        //challenge 5
        System.out.print("Enter a string --> ");
        String evenString = console.next();
        System.out.println(evenString.substring(0, evenString.length()/2));
        
        //challenge 6
        System.out.println("Enter two strings");
        System.out.print("-->");
        String alpha = console.next();
        alpha = alpha.substring(1, alpha.length());
        System.out.print("-->");
        String beta = console.next();
        beta = beta.substring(1, beta.length());
        System.out.println(alpha+beta);
        
        //challenge 8
        System.out.print("Enter a string --> ");
        alpha = console.next();
        if ("bad".equals(alpha.substring(0,3)))
        {
            System.out.println("HAS BAD");
        }
        
        //challenge 9
        System.out.print("Enter a string --> ");
        beta = console.next();
        if (beta.equals("way") != true)
        {
            System.out.println("No way");
        }
        
        //challenge 10
        System.out.print("Enter a string --> ");
        beta = console.next();
        System.out.println(beta.substring(1, beta.length() - 1));
        
        //challenge 11
        System.out.print("Enter a string with an odd number of charecters --> ");
        String oddString = console.next();
        while (oddString.length() != 3)
        {
            oddString = oddString.substring(1, oddString.length() - 1);
        }
        System.out.println(oddString);
    }
}