package ru.mirea.lab1;

import java.util.Scanner;

public class Class2
{
    public static void main(String[] args)
    {
        int min = 100, max = -100, sum = 0, n = 0, i = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = input.nextInt();
        int arr[] = new int[size];
        System.out.println("Введите массив: ");
        while(i < size)
        {
            arr[i] = input.nextInt();
            sum = sum+ arr[i];
            if(arr[i] < min)
            {
                min = arr[i];
            }
            if(arr[i] > max)
            {
                max = arr[i];
            }
            i++;
        }
        System.out.println("Сумма = "+ sum);
        System.out.println("Min = "+min+ " ; " + "Max = "+ max);
    }
}
