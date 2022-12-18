package ru.mirea.lab3.Point;

import java.util.*;


public class Tester
{
    public static void main(String[] args)
    {
        int length = 5;
        Random random = new Random();

        List<Circle> circles = new ArrayList<>();//интерфейс List (списки), способный изменять размер

        for (int i = 0; i < length; i++)
            circles.add(new Circle(random.nextDouble(100.0), random.nextDouble(100.0), random.nextInt(100)));

         for (Circle c: circles)
             System.out.println(c);

        System.out.println("Самая большая окружность: " + Collections.max(circles));
        System.out.println("Самая маленькая окружность: " + Collections.min(circles));
        System.out.println("Отсортированные окружности: ");
        Collections.sort(circles);
        System.out.print(circles);
    }
}
