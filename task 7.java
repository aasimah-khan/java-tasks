import java.util.*;
public class Task7
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows");
        int m = sc.nextInt();
        System.out.println("Enter the no. of columns");
        int n = sc.nextInt();
        int[][] a = new int[m][n];
        int[][] b = new int[m][n];
        System.out.println("Enter the elements of the first matrix");
        for(int i = 0 ; i < m ; i++)
        {
            for(int j = 0 ; j < n ; j++)
                a[i][j] = sc.nextInt();
        }
        System.out.println("Enter the elements of the second matrix matrix");
        for(int i = 0 ; i < m ; i++)
        {
            for(int j = 0 ; j < n ; j++)
                b[i][j] = sc.nextInt();
        }
        for(int i = 0 ; i < m ; i++)
        {
            for(int j = 0 ; j < n ; j++)
                System.out.print( a[i][j] + b[i][j] + "\t" );
            System.out.println();
        }
    }
}