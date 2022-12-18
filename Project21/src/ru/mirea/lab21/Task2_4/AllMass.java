package ru.mirea.lab21.Task2_4;

import java.util.Arrays;

public class AllMass <T>
{
    private T[] arr;

    public AllMass(T[] arr)
    {
        this.arr = arr;
    }
    public void print()
    {
        System.out.println("Тип данных: "+arr.getClass().getName());
        System.out.println(Arrays.toString(arr));
    }
}
