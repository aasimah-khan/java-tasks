import java.util.*;
public class Task1
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        double r = sc.nextDouble();
        double perimeter = 2*3.14*r;
        double area = 3.14*r*r;
        System.out.println("Perimeter is " + perimeter + "\nArea is " + area);
    }
}