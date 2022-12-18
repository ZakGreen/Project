package ru.mirea.lab7.Math;

import java.util.Scanner;

public class Test
{
    public static void main(String[] args)
    {
        MathCalculable mathFunc = new MathFunc();
        Scanner input = new Scanner(System.in);
        System.out.println("Введите радиус окружности: ");
        int radious = input.nextInt();
        int lengthOfCircle =  (int)(2 *radious * mathFunc.getPI());

        System.out.println(String.format("Длина круга: %s", lengthOfCircle));


    }
}
