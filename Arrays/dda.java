package Arrays;

import java.util.*;
public class dda {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns of matrix: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        int i=0, j=0;
        
        //taking input for array
        for(i=0; i<r; i++)
        {
            for(j=0; j<c; j++)
            {
                System.out.println("Enter the elements of the matrix:");
                arr[i][j] =sc.nextInt();
            }
        }
        
        //printing the array
        System.out.println("Entered Array: ");
        for(i=0; i<r; i++)
        {
            for(j=0; j<c; j++)
            {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        
        //sum of all elements
        int s=0;
        for(i=0; i<r; i++)
        {
            for(j=0; j<c;j++)
            {
                s = arr[i][j] + s;
            }
        }
        System.out.println("Sum of all elements: " +s);
        
        //sum of rows
        int sr=0;
        for(j=0; j<c; j++)
        {
            for(i=0; i<r; i++)
            {
                sr += arr[j][i];
            }
            System.out.println("Sum of Row "+j+"= "+sr);
            sr=0;
        }
        
        //sum of columns
        int scol=0;
        for(i=0; i<r; i++)
        {
            scol=0;
            for(j=0; j<c; j++)
            {
                scol += arr[j][i];
            }
            System.out.println("Sum of Column "+i+"= "+scol);
        }
        
        //sum of boundary
        
    }
}
