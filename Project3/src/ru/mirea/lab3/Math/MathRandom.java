package ru.mirea.lab3.Math;
import java.util.*;

public class MathRandom
{
    public static void main(String[] args)
    {
        int i = 0;
        Random rand = new Random();
        System.out.println("Введите размер массива: ");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        float arr[] = new float[size];
        System.out.println("Массив: ");
        while(i < size)
        {
            arr[i] = rand.nextFloat(10);
            //System.out.println(Math.random());
            System.out.println(arr[i]);
            i++;
        }
        System.out.println("Отсортированный массив: ");
        Arrays.sort(arr);//Сортировка массива arr
        System.out.println(Arrays.toString(arr));
    }
}
