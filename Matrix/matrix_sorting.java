package Matrix;

import java.util.*;
public class matrix_sorting
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int m;
        System.out.println("Enter the size of your square matrix");
        m = sc.nextInt();
        int ar[][] = new int [m][m];
        System.out.println("Enter the elements of your matrix");
        
        int i, j;
        for (i = 0; i < m; i++) {
            for (j = 0; j < m; j++) {
                System.out.print("Enter element at ("+i+","+j+"): ");
                ar[i][j] = sc.nextInt();
            }
        }
        
        for (i = 0; i <m; i ++)
        {
            for(j = 0; j < m; j++)
            {
                System.out.print(ar[i][j] +" ");
            }
            System.out.println();
        }
        
        //whole matrix sorting
        int x = ar.length;
        int flat[] = new int [x * x];
    }
}
