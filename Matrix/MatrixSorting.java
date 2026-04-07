package Matrix;

import java.util.*;
import java.util.*;
public class MatrixSorting 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of square matrix (n):");
        int n=sc.nextInt(),i,j,k;
        int a[][]=new int[n][n];
        System.out.println("Enter elements of the matrix:");
        for (i=0;i<n;i++) 
        {
            for (j = 0; j < n; j++) 
            {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Original Matrix:");
        for (i = 0; i < n; i++)
        {
            for (j = 0; j < n; j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        int arr[]=new int[n*n];
        for (i = 0; i < n; i++)
        {
            for (j = 0; j < n; j++) 
            {
                arr[j]=a[i][j];
            }
            int h,o;
             for ( h=0;h<n-1;h++)
             {
            for (o=0;o<n-h-1;o++) 
            {
                if (arr[o] > arr[o + 1]) {
                    int temp = arr[o];
                    arr[o] = arr[o + 1];
                    arr[o + 1] = temp;
                }
            }
        }
         for (k = 0; k < n; k++) 
            {
                a[i][k]=arr[k];
            }
        }
        System.out.println("MATRIX AFTER ROW WISE SORTNG:");
        for (i = 0; i < n; i++)
        {
            for (j = 0; j < n; j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        for (i = 0; i < n; i++)
        {
            for (j = 0; j < n; j++) 
            {
                arr[j]=a[j][i];
            }
            int h,o;
             for ( h=0;h<n-1;h++)
             {
            for (o=0;o<n-h-1;o++) 
            {
                if (arr[o] > arr[o + 1]) {
                    int temp = arr[o];
                    arr[o] = arr[o + 1];
                    arr[o + 1] = temp;
                }
            }
        }
         for (k = 0; k < n; k++) 
            {
                a[k][i]=arr[k];
            }
        }
        System.out.println("MATRIX AFTER COLUMN WISE SORTNG:");
        for (i = 0; i < n; i++)
        {
            for (j = 0; j < n; j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Your whole matrix sorted");
        arr=new int[n*n];k=0;
        for (i=0;i<n;i++) 
        {
            for (j = 0; j < n; j++) 
            {
                arr[k]=a[i][j];
                k++;
            }
        }
         int h,o,temp=0;
             for ( h=0;h<arr.length-1;h++)
             {
            for (o=0;o<arr.length-h-1;o++) 
            {
                if (arr[o] > arr[o + 1]) {
                   temp = arr[o];
                    arr[o] = arr[o + 1];
                    arr[o + 1] = temp;
                }
            }
        }
        k=0;
        for (i=0;i<n;i++) 
        {
            for (j = 0; j < n; j++) 
            {
                a[i][j]=arr[k];
                k++;
            }
        }
        for (i = 0; i < n; i++)
        {
            for (j = 0; j < n; j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
        
        
