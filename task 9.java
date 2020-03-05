import java.util.*;
public class Task9
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int s1 = a<b?a:b;
        int s2 = s1<c?s1:c;
        System.out.println("The smallest no. is " + s2);
    }
}