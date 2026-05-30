package NumberBased;
import java.util.Scanner;
public class Distance {
    int km;
    int m;
    Distance(int km, int m) {
        km = 0;
        m = 0;
    }
    void accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the distance in km: ");
        km = sc.nextInt();
        System.out.print("Enter the distance in m: ");
        m = sc.nextInt();
    }
    void addDist(Distance d1, Distance d2)
    {
        km = d1.km + d2.km;
        m = d1.m + d2.m;
    }
    void display()
    {
        System.out.println("Sum of distance in km: "+km);
        System.out.println("Sum of distance in m: "+m);
    }
    public static void main() {
        Scanner sc = new Scanner(System.in);
        Distance d1 = new Distance(0,0);
        Distance d2 = new Distance(0,0);
        Distance d3 = new Distance(0,0);
        d1.accept();
        d2.accept();
        d3.addDist(d1, d2);
        d3.display();
    }
}
