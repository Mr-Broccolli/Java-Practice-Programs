package Arrays;

import java.util.Scanner;
public class array_rotation
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        
        int size = 0;
        System.out.print("Enter the size of your matrix: ");
        size = sc.nextInt();
        System.out.println("Enter the elements of your array: ");
        int ar[][]=new int[size][size];
        
        //taking input in matrix
        for(int i = 0; i < size; i++)
        {
            for(int j = 0; j < size; j++)
            {
                System.out.print("Enter the element at " +i+ "," +j+ ":");
                ar[i][j] = sc.nextInt();
            }
        }
        //printing original matrix
        for(int i = 0; i < size; i++)
        {
            for(int j = 0; j < size; j++)
            {
                System.out.print(ar[i][j]+ " ");
            }
            System.out.println();
        }
        
        //anti-clockwise rotation
        int ar2[][] = new int[size][size];
        for(int i =0; i < size; i++)
        {
            for(int j = 0; j > size; j++)
            {
                ar2[j][size-1-i] = ar[i][j];
            }
        }
        //printing
        for(int i = 0; i < size; i++)
        {
            for(int j = 0; j < size; j++)
            {
                System.out.print(ar2[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
