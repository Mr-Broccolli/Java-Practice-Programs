package NumberBased;
import java.util.*;
public class Time {
    int hr;
    int min;
    Time(int h, int m) {
        hr = h;
        min = m;
    }
    void readtime() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Time in Hour: ");
        hr = sc.nextInt();
        System.out.print("Enter Time in Minute: ");
        min = sc.nextInt();
    }
    void addtime(Time A, Time B) {
        hr = A.hr + B.hr;
        min = A.min + B.min;
    
        if(min >= 60) {
            hr += min / 60;
            min = min % 60;
        }
    }
    void display() {
        System.out.print("Time= "+hr+"Hr "+min+"Min ");
    }
    public static void main() {
        Time A = new Time(0,0);
        Time B = new Time(0,0);
        Time C = new Time(0,0);
        
        A.readtime();
        B.readtime();
        
        C.addtime(A,B);
        C.display();
    }
}
