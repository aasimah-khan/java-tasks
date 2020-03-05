import java.util.*;
public class Task3
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.");
        int n = sc.nextInt();
        int sum = 0;
        while( n!=0 )
        {
            int d = n%10;
            sum = sum + d;
            n = n/10;
        }
        System.out.println("The sum of digits is = " + sum);
    }
}