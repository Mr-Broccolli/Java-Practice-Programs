package Recursion;

import java.util.*;
public class recursion
{
    void finite(int n) {
        if(n>0)
        {
            System.out.println(n);
            finite(--n);
            System.out.println(n);
        }
    }
}
