//Name: Prabhav P.
//Period: 1A

import java.util.*;
import java.lang.Math;

public class QuadraticFormula
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        
        //challenge 1
        System.out.println("Enter 2 numbers");
        System.out.print("--> ");
        double alpha = console.nextDouble();
        System.out.print("--> ");
        double beta = console.nextDouble();
        double a = Math.max(alpha, beta);
        System.out.println(a);
        
        //challenge 2
        System.out.print("Enter a number --> ");
        double toCube = console.nextDouble();
        toCube = Math.pow(toCube, 3);
        System.out.println(toCube);
        
        //challenge 3
        System.out.println("Enter 2 numbers");
        System.out.print("--> ");
        double base = console.nextDouble();
        System.out.print("--> ");
        double exponent = console.nextDouble();
        double c = Math.pow(base, exponent);
        System.out.println(c);
        
        //challenge 4
        System.out.print("Enter a number --> ");
        double num = console.nextDouble();
        num = Math.rint(num);
        System.out.println(num);
        
        //challenge 5
        System.out.print("Enter a number --> ");
        double num2 = console.nextDouble();
        num2 = Math.sqrt(num2);
        System.out.println(num2);
        
        //challenge 6
        System.out.println("Enter 2 numbers");
        System.out.print("--> ");
        double sideA = console.nextDouble();
        System.out.print("--> ");
        double sideB = console.nextDouble();
        sideA = Math.pow(sideA, 2);
        sideB = Math.pow(sideB, 2);
        double sideC = sideA + sideB;
        sideC = Math.sqrt(sideC);
        System.out.println(sideC);
        
        //challenge 7
        System.out.println("Enter 2 numbers");
        System.out.print("--> ");
        double gamma = console.nextDouble();
        System.out.print("--> ");
        double delta = console.nextDouble();
        gamma = Math.abs(gamma);
        delta = Math.abs(delta);
        double f = Math.min(gamma, delta);
        System.out.println(f);
        
        //challenge 8
        System.out.println("Enter 2 numbers");
        System.out.print("--> ");
        double cylinderRadius = console.nextDouble();
        System.out.print("--> ");
        double cylinderHeight = console.nextDouble();
        double pi = Math.PI;
        double r2 = Math.pow(cylinderRadius, 2);
        double area = (2 * pi * cylinderRadius * cylinderHeight) + (2 * (pi * r2));
        System.out.println(area);
        
        //challenge 9
        System.out.print("Enter a number --> ");
        double sphereRadius = console.nextDouble();
        double g = 4 / 3;
        double pi2 = Math.PI;
        double r3 = Math.pow(sphereRadius, 3);
        double volume = g * pi2 * r3;
        System.out.println(volume);
    }
}