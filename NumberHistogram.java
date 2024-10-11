//Name: Prabhav P.
//Period: 1A

import java.util.*;

public class NumberHistogram
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in); 
        int[] nums = {2, 4, 5, 8, 16, 2, 3, 5, 9, 0, 9, 12, 6};
        
        //2
        System.out.println(nums[0]);
        
        //3
        System.out.println(nums[1]);
        
        //4
        System.out.println(nums[3]);
        
        //5
        System.out.println(nums[12]);
        
        //6
        System.out.println(nums.length);
        
        //7
        System.out.println(nums[nums.length - 1]);
        
        //9
        int number;
        int elem;
        for (elem = 0; elem < 13; elem++)
        {
            number = nums[elem];
            System.out.print(number+" ");
        }
        System.out.println();
        
        //10
        if (nums[0] == 6 || nums[nums.length - 1] == 6)
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }
        
        //11
        boolean aboveTen = false;
        for (elem = 0; aboveTen == false && elem < 13; elem++)
        {
            if (nums[elem] > 10)
            {
                System.out.println("Above 10");
                aboveTen = true;
            }
        }
        
        //12
        boolean isSix = false;
        for (elem = 0; isSix == false && elem < 13; elem++)
        {
            if (nums[elem] == 6)
            {
                System.out.println("Found a 6");
                isSix = true;
            }
        }
        if (isSix == false)
        {
            System.out.println("No 6");
        }
        
        //13
        boolean withinRange = true;
        for (elem = 0; withinRange != false && elem < 13; elem++)
        {
            if (nums[elem] != 2 || nums[elem] != 3 || nums[elem] != 4 || nums[elem] != 5 || nums[elem] != 6 || nums[elem] != 7 || nums[elem] != 8)
            {
                System.out.println("Not within 2 to 8");
                withinRange = false;
            }
        }
        if (withinRange == true)
        {
            System.out.println("Within 2 to 8");
        }
    }
}