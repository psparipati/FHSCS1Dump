//Name: Prabhav P.
//Period: 1A

public class MyPoem
{
    public static void main(String[] args)
    {
        String original = "We know what we are, but know not what we may be.";
        String blackout = original.substring(0,13);
        blackout += original.substring(23, 24);
        blackout += original.substring(27, 28);
        blackout += original.substring(45, 49);
        System.out.print(blackout);
    }
}