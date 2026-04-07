package Strings;

import java.util.*;
class name_with_scanner
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        String name;
        int i=0;
        for(i=1; i<=5; i++)
        {
            System.out.println("enter name");
            name = sc.nextLine();
            System.out.println("name="+name);
