//Name: Prabhav
//Period: 1A

import java.util.*;

public class PrimeCheckerAPP
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        
        int caller = 0;
        int prime;
        boolean isComposite = false;
        while (caller != 2)
        {
            System.out.print("Press 1 to check if a number is prime, or press 2 to quit: ");
            caller = console.nextInt();
            System.out.print("");
            if (caller == 2)
            {
                break;
            }
            System.out.print("Enter a number to enter in our algorithm: ");
            prime = console.nextInt();
            for (int factor = 1; (isComposite == false) && (factor < (prime - 1)); factor++)
            {
                if ((prime % factor) == 0)
                {
                    isComposite = true;
                }
            }
            if (isComposite == false)
            {
                System.out.println(prime+" is prime.");
            }
            else if (isComposite == true)
            {
                System.out.println(prime+" is composite.");
            }
        }
    }
}
