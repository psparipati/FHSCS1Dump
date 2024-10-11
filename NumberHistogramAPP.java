//Name: Prabhav P.
//Period: 1A

import java.util.*;

public class NumberHistogramAPP
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        Random numerical = new Random();
        int[] nums = new int[25];
        for (int i = 0; i != 25; i++)
        {
            nums[i] = numerical.nextInt(10);
        }
        int[] histogram = new int[10];
        int k;
        for (int j = nums.length - 1; j != -1; j--)
        {
            k = nums[j];
            histogram[k]++;
        }
        System.out.println("0 occured "+histogram[0]+" times.");
        System.out.println("1 occured "+histogram[1]+" times.");
        System.out.println("2 occured "+histogram[2]+" times.");
        System.out.println("3 occured "+histogram[3]+" times.");
        System.out.println("4 occured "+histogram[4]+" times.");
        System.out.println("5 occured "+histogram[5]+" times.");
        System.out.println("6 occured "+histogram[6]+" times.");
        System.out.println("7 occured "+histogram[7]+" times.");
        System.out.println("8 occured "+histogram[8]+" times.");
        System.out.println("9 occured "+histogram[9]+" times.");
    }
}