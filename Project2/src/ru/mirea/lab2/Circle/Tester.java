package ru.mirea.lab2.Circle;

import java.util.*;

    public class Tester
    {
        public static void main(String[] args)
        {
            int length = 5;
            Random random = new Random();

            List<Circle> circles = new ArrayList<>();//интерфейс List (списки), способный изменять размер

            for (int i = 0; i < length; i++)
                circles.add(new Circle(random.nextDouble(100.0), random.nextDouble(100.0), random.nextDouble(10.0)));

            for (Circle c: circles)
                System.out.println(c);
        }
    }
