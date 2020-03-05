import java.util.*;
public class Task4
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length");
        double in = sc.nextDouble();
        double x = 0.0254;
        double m = in*x;
        System.out.println("The length in meters is " + m);
    }
}