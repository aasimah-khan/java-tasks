import java.util.*;
public class Task2
{
    public static void main() 
    {
        long bin1, bin2;
        int i = 0, rem = 0;
        int[] sum = new int[20];
        Scanner scan = new Scanner(System.in);
        System.out.println("enter first binary number");
        bin1 = scan.nextLong();
        System.out.println("enter second binary number");
        bin2 = scan.nextLong();
        while (bin1 != 0 || bin2 != 0)
        {
            sum[i++] = (int)((bin1 % 10 + bin2 % 10 + rem)%2);
            rem = (int)((bin1 % 10 + bin2 % 10 + rem)/2);
            bin1 = bin1/10;
            bin2 = bin2/10;
        }
        if (rem != 0)
        {
            sum[i++] = rem;
        }
        --i;
        System.out.println("Result");
        while(i >= 0)
        {
            System.out.print(sum[i--]);
        }
    }
}