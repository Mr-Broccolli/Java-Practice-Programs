package Arrays;

import java.util.*;
public class double_array
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        
        int r, c;
        System.out.print("Enter the number of Rows and Columns: ");
        r = sc.nextInt();
        c = sc.nextInt();
        
        int ar[][] = new int[r][c];
        int i=0, j=0;
        System.out.println("Enter the elements of array: ");
        
        //taking input
        for(i=0; i<r; i++)
        {
            for(j=0; j<c; j++)
            {
                ar[i][j] = sc.nextInt();
            }
        }
        
        //printing aray
        for(i; i<r; i++)
        {
            for(j; j<c; j++)
            {
                System.out.print(i); 
            }
            System.out.print(j);
        }
        
        //sum of rows
        
    }
}
