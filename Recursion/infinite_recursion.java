package Recursion;

import java.util.*;
public class infinite_recursion
{
    void infinite(int n) {
        if(n>0)
        {
            System.out.println(n);
            infinite(n--);
            System.out.println(n);
        }
    }
}
