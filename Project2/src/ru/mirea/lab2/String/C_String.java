package ru.mirea.lab2.String;

import java.util.*;

public class C_String
{
    public static void main(String[] args)
    {
        List <String> string = new ArrayList<>(Arrays.asList("1", "2", "3", "4", "5"));
        System.out.println(string);
        Collections.reverse(string);
        System.out.println(string);
    }
}
