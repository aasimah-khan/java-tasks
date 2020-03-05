import java.util.*;
public class Task8
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        int l = s.length();
        s = s.toLowerCase();
        int f = 0;
        for(int i = 0 ; i < l ; i++)
        {
            char c = s.charAt(i);
            if( c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                f++;
        }
        System.out.println("The no. of vowels is " + f); 
    }
} 