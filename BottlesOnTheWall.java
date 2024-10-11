//Name: Prabhav P.
//Period: 1A
import java.util.*;

public class BottlesOnTheWall
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        
        //challenge 2
        int a = 1;
        while (a < 10)
        {
            System.out.print(a);
            a ++ ;
        }
        System.out.println("            ");
        System.out.println("            ");
        
        //challenge 3
        int b = 1;
        while (b < 10)
        {
            System.out.print(b + " ");
            b ++ ;
        }
        System.out.println("            ");
        System.out.println("            ");
        
        //challenge 4
        int c = 1;
        while (c < 20)
        {
            System.out.print(c + " ");
            c += 2;
        }
        System.out.println("            ");
        System.out.println("            ");
        
        //challenge 5
        int d = 5;
        while (d < 55)
        {
            System.out.print(d + " ");
            d += 5;
        }
        System.out.println("            ");
        System.out.println("            ");
        
        //challenge 6
        int e = 10;
        while (e > 0)
        {
            System.out.print(e + " ");
            e -- ;
        }
        System.out.println("            ");
        System.out.println("            ");
        
        //challenge 8
        int f = -4;
        while (f != -44)
        {
            System.out.print(f + " ");
            f -= 4;
        }
        System.out.println("            ");
        System.out.println("            ");
        
        //challenge 9
        int g = 1;
        while (g != 512)
        {
            System.out.print(g + " ");
            g *= 2;
        }
        System.out.println("            ");
        System.out.println("            ");
        
        //challenge 10
        double h = 1000;
        while (h != 1)
        {
            System.out.print(h + " ");
            h /= 2;
            double modulus = h % 1;
            h = h - modulus;
        }
        System.out.println("            ");
        System.out.println("            ");
        
        //challenge 11 - whenever you come back please help me
        int i = 1;
        while (i != 9)
        {
            System.out.print(i + " ");
            int increment = 2;
            if (i > 0)
            {
                i -= increment;
            }
            else if (i < 0)
            {
                i += increment;
            }
            increment ++ ;
        }
    }
 }