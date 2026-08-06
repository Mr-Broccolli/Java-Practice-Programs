package Arrays;
import java.util.*;
class BorderSum {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int c = sc.nextInt();
        int A[][] = new int[r][c];
        int sum = 0;
        System.out.println("Enter the matrix:");
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                A[i][j]=sc.nextInt();
        System.out.println("Original Matrix:");
        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++)
                System.out.print(A[i][j]+" ");
            System.out.println();
        }
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                if(i==0 || i==r-1 || j==0 || j==c-1)
                    sum+=A[i][j];
        System.out.println("Sum of Border Elements = "+sum);
    }
}