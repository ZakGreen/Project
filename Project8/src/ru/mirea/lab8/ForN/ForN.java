package ru.mirea.lab8.ForN;

import java.util.*;

public class ForN
{
   private static void Enum(int n)
   {
       for(int i = 1; i <= n; i++)
       {
           System.out.print(String.format("%s ",i));
       }
   }

   public static void main(String [] args)
   {
       Scanner input = new Scanner(System.in);
       System.out.println("Введите N: ");
       int n = input.nextInt();
        System.out.println("Результат: ");
       Enum(n);

   }
}

