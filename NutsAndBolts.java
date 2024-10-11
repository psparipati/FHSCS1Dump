//Name: Prabhav P.
//Period: 1A

import java.util.*;

public class NutsAndBolts
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        
        //challenge 1
        System.out.println("Enter 2 different numbers consecutively.");
        int num1 = console.nextInt();
        int num2 = console.nextInt();
        if (num1 == num2)
        {
            System.out.println("Same");
        }
        else if (num1 > num2)
        {
            System.out.println(num1);
        }
        else if (num1 < num2)
        {
            System.out.println(num2);
        }
        
        //challenge 2
        System.out.println("Enter the amount of the bill: ");
        double totalBill = console.nextDouble();
        double finalBill = totalBill;
        if (totalBill > 2000)
        {
            finalBill = finalBill - (totalBill * 0.15);
            System.out.println("Total with discounts applied: "+finalBill);
        }
        else if ((totalBill > 1000) && (totalBill < 2000))
        {
            finalBill = finalBill - (totalBill * 0.1);
            System.out.println("Total with discounts applied: "+finalBill);
        }
        else if (totalBill < 1000)
        {
            System.out.println("Total with discounts applied: "+finalBill);
        }
        
        //challenge 3
        System.out.println("Enter the amount of the bill: ");
        double totalBill2 = console.nextDouble();
        double finalBill2 = totalBill;
        System.out.println("Do you have a coupon? true or false");
        boolean hasCoupon = console.nextBoolean();
        if (totalBill2 > 2000)
        {
            finalBill2 = finalBill2 - (totalBill2 * 0.15);
            if (hasCoupon == true)
            {
                finalBill2 = finalBill2 - (finalBill2 * 0.05);
            }
            System.out.println("Total with all discounts applied: "+finalBill2);
        }
        else if ((totalBill2 > 1000) && (totalBill2 < 2000))
        {
            finalBill2 = finalBill2 - (totalBill2 * 0.1);
            if (hasCoupon == true)
            {
                finalBill2 = finalBill2 - (finalBill2 * 0.05);
            }
            System.out.println("Total with all discounts applied: "+finalBill2);
        }
        else if (totalBill2 < 1000)
        {
            if (hasCoupon == true)
            {
                finalBill2 = finalBill2 - (finalBill2 * 0.05);
            }
            System.out.println("Total with all discounts applied: "+finalBill2);
        }
        
        //challenge 5
        System.out.println("What year are you calculating? ");
        int year = console.nextInt();
        if (((year % 100) == 0) && (year % 4) == 0)
        {
            System.out.println("A leap year means 1 more day of school! Why?");
        }
        else if ((year % 100) == 0)
        {
            System.out.println("Not a leap year!");
        }
        else if ((year % 4) == 0)
        {
            System.out.println("A leap year means 1 more day of school! Why?");
        }
        else
        {
            System.out.println("Not a leap year!");
        }
    }
}