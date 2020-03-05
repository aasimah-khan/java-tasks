import java.util.*;
public class Task10
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of terms");
        int n = sc.nextInt();
        double cube = 0;
        for(int i = 0 ; i < n ; i++)
        {
            cube = Math.pow( i+1 , 3 );
            System.out.println("Number is: " + (i+1) + " and cube of " + (i+1) + " is: " + cube);
        }
    }
}