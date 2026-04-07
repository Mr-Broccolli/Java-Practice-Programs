package Recursion;

import java.util.*;
public class infinite_recursion2
{
    void infinite(int n) {
        if(n>0)
        {
            infinite(--n);
            System.out.println(n);
        }
    }
}
