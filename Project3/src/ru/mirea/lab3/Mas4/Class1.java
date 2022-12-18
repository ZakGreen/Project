package ru.mirea.lab3.Mas4;

import java.util.*;

public class Class1
{
    public static void main(String args[])
    {
        Random rand = new Random();
        int[] arr = new int[4];//int[] arr = {1,2,3,4,5};
        System.out.println("Массив: ");
        for(int i =0; i<arr.length;i++)
        {
           arr[i] = rand.nextInt(10,99) ;
           System.out.println(arr[i]);
        }
        boolean flag = false;
        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i]<arr[i+1])
            {
                flag = true;
            }
            else
            {
                flag = false;
                break;
            }
        }
        if(flag == true)
        {
            System.out.println("Массив строго возрастающий!");
        }
        else System.out.println("Массив не строго возрастающий!");
    }
}
