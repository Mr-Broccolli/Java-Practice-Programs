package Matrix;

import java.util.*;
public class matrix_sorting2
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.print("Enter the size of the double matrix: ");
        size = sc.nextInt();
        int ar[][] = new int [size][size];
        System.out.println("Enter the elements of your matrix");
        
        //entering elements
        int i, j;
        for (i = 0; i < size; i++) {
            for (j = 0; j < size; j++) {
                System.out.print("Enter element at ("+i+","+j+"): ");
                ar[i][j] = sc.nextInt();
            }
        }
        
        //displaying the orginal matrix
        System.out.println("Your matrix");
        for (i = 0; i <size; i ++)
        {
            for(j = 0; j < size; j++)
            {
                System.out.print(ar[i][j] +" ");
            }
            System.out.println();
        } 
        
        //sorting the array
        int p,o;
        int n = ar.length;
        //for (p = 0; p < n - 1; p++) {
        //    for (o = 0; o < n - p - 1; o++) {
        //        if (ar[o] > ar[o + 1]) {
        //            int temp = ar[o];
        //            ar[o] = ar[o + 1];
        //            ar[o + 1] = temp;
        //        }
        //    }
        //}
        
        //converting to 1d  
        int[] flat = new int[size * size];
        int k = 0;

        // Flatten the matrix into 1D array
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                flat[k] = ar[i][j];
                k++;
            }
        }
        System.out.println(flat[k]);
    }
}
