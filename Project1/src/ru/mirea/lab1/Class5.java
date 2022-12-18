package ru.mirea.lab1;

import java.util.Scanner;

public class Class5
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = input.nextInt();
        System.out.println("Факториал числа: ");
        System.out.println(Fact(a));
    }

    public static int Fact(int f)
    {
        if(f < 1)
        {
            System.out.println("Ошибка введённого числа");
            return 0;//return 1;
        }
        else
        {
            int n = 1;
            for (int i = 1; i <= f; i++) {
                n = n * i;
            }
            return n;
        }
    }
}
