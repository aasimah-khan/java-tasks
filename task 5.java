import java.util.*;
public class Task5
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the minutes");
        long min = sc.nextInt();
        long hr = min/60;
        long days = hr/24;
        long yrs = days/365;
        days = days%365;
        System.out.println(min + " is approximately " + yrs + " years and " + days + " days");
    }
}