import java.util.*;
public class Task6
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.");
        int n = sc.nextInt();
        if( n < 0 )
            System.out.println("Negative");
        else if( n > 0 )
            System.out.println("Positive");
        else
            System.out.println("Zero");
    }
}