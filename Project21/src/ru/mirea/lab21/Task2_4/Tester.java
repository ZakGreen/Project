package ru.mirea.lab21.Task2_4;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class Tester
{
    public static Integer[] numbers = new Integer[] { 1, 2, 3, 4, 5 };
    public static String[] str = new String[] { "A","B","C", "D", "E" };

    public static void returnIndex(int i)
    {
        System.out.println("Элемент: " + str[i] + ", с индексом - " + i);
    }

    public static void main(String[] args)
    {
        AllMass obj = new AllMass(new Integer[]{1, 324, 43});

        obj.print();

        returnIndex(4);

        System.out.println("\n");

        File dir = new File(".");
        List<String> list1 = List.of(dir.list());

        for (int i = 0; i < 5; i++)
            System.out.println(list1.get(i));
    }

}
