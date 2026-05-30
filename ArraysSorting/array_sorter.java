package ArraysSorting;

 

import java.util.*;
public class array_sorter
{
    public static void main(String args[])
    {
        Scanner st = new Scanner(System.in);
        System.out.println("Enter the length of mXm array");
        int n=st.nextInt(),min=0,t=0;
        int ac[]=new int[n*n];
        int a[][]=new int[n][n];
        int i,j,k=0;
        
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=st.nextInt();
                if(k<=n*n)
                {
                    ac[k]=a[i][j];
                    k++;
                }
            }
        }
        
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        
        for(i=0;i<=ac.length;i++)
        {
            min=i;
            for(j=i+1;j<ac.length;j++)
            {
                if (ac[min]>ac[j])
                min=j;
                
                t=ac[i];
                ac[i]=ac[min];
                ac[min]=t;
            }
        }
        
        k=0;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=ac[k];
                k++;
            }
        }
        
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}



