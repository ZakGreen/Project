package ru.mirea.lab3.MasN;

import java.util.*;

public class Class2
{
    public static void main(String args[])
    {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        while(true)
        {
            int n = input.nextInt();
            if(n < 0)
            {
                System.out.println("Введённый размер не соответсвует условию! Введите размер повторно: ");
            }
            else
            {
                    int[] arr = new int[n];
                    System.out.println("Массив: ");
                    for (int i = 0; i < arr.length; i++)
                    {
                        arr[i] = rand.nextInt(0, n);
                        System.out.println(arr[i]);
                    }
                    System.out.println("Массив чётных чисел: ");
                    for (int i = 0; i < arr.length; i++)
                    {
                        if (arr[i] % 2 == 0 && arr[i] != 0)
                        {
                            System.out.println(arr[i]);
                        }
                    }
            }
        }



















        /*
        do {
            if (n < 0)
            {
                System.out.println("Введённый размер не соответсвует условию! Введите размер повторно: ");
                n = input.nextInt();
                int[] arr = new int[n];
                System.out.println("Массив: ");
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = rand.nextInt(0, n);
                    System.out.println(arr[i]);
                }
                System.out.println("Массив чётных чисел: ");
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] % 2 == 0 && arr[i] != 0) {
                        System.out.println(arr[i]);
                    }
                }
            } else {
                int[] arr = new int[n];
                System.out.println("Массив: ");
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = rand.nextInt(0, n);
                    System.out.println(arr[i]);
                }
                System.out.println("Массив чётных чисел: ");
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] % 2 == 0 && arr[i] != 0) {
                        System.out.println(arr[i]);
                    }
                }
            }
        }while(n>0);*/
    }
}
