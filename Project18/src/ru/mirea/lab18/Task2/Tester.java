package ru.mirea.lab18.Task2;

import java.util.Scanner;

public class Tester
{
    public void exceptionDemo()
    {
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        try
        {
            int i = Integer.parseInt(intString);
            System.out.println( 2/i );
           // System.out.println("Ваше число - " + intString);
        }
        catch (NumberFormatException exception)
        {
            System.out.println("Ошибка! Не целочисленное!");
        }
        catch (ArithmeticException exception)
        {
            System.out.println("Ошибка! Деление на ноль!");
        }
    }

    public static void main(String[] args)
    {
        Tester tester = new Tester();

        tester.exceptionDemo();
    }
}
