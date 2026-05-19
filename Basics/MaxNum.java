package Basics;
import java.util.Scanner;
public class MaxNum {
    int num;
    //parameterized constructo
    MaxNum(int x) {
        num = x;
    }
    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        num = sc.nextInt();
    }
    void findMax(MaxNum A, MaxNum B) {
        if(A.num > B.num) {
            num = A.num;
        } else {
            num = B.num;
        }
    }
    void display() {
        System.out.println("Maximum num: " + num);
    }
    public static void main() {
        MaxNum A = new MaxNum(0);
        MaxNum B = new MaxNum(0);
        MaxNum C = new MaxNum(0);
        System.out.println("Enter first number:");
        A.accept();
        System.out.println("Enter second number:");
        B.accept();

        C.findMax(A, B);
        C.display();
    }
}