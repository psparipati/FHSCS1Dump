//Name: Prabhav P.
//Period: 1A

import java.util.*;
import java.lang.String;

public class PalindromeAPP
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        
        while (true)
        {
            System.out.print("Press 1 to use the palindrome machine, or press 2 to quit. --> ");
            int choice = console.nextInt();
            boolean isPalindrome = true;
            if (choice == 1)
            {
                System.out.print("Enter a string into our machine to check if it is a palindrome. --> ");
                String palindrome = console.next();
                for (int a = 1; a < palindrome.length(); a++)
                {
                    if (palindrome.charAt(a) != palindrome.charAt(palindrome.length() - (a + 1)))
                    {
                        System.out.println("This is not a palindrome.");
                        isPalindrome = false;
                        break;
                    }
                }
                if (isPalindrome == true)
                {
                    System.out.println("This is a palindrome.");
                } 
            }
            else if (choice == 2)
            {
                System.out.println("Thank you for using the palindrome machine.");
                break;
            }
        }
    }
}