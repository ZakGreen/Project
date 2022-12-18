package ru.mirea.lab16.Task1;

import java.util.Scanner;

public class Tester
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        int a = 1 + (int) (Math.random() * 19);
        System.out.println("Угадайте число от 0 до 20");
        int i = 1;

        while(i < 4)
        {
            int guess = input.nextInt();

            if (guess < a)
            {
                System.out.println("Ваше число меньше задуманного! Попробуйте ещё раз!");
                i++;
            }
            else if (guess > a)
            {
                System.out.println("Ваше число больше задуманного! Попробуйте ещё раз!");
                i++;
            }
            else
            {
                System.out.println("Вы угадали число!!!");
                System.out.println("У вас была " + i + " попытка!");
                break;
            }
            if(i>3)
            {
                System.out.println("Вы превысили число попыток! Вы проиграли!");
                break;
            }
        }
    }
}
