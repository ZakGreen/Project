package ru.mirea.lab18.Task3;

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
        catch (Exception exception)
        {
            System.out.println("Ошибка!");
        }
        /*catch (ArithmeticException exception)
        {
            System.out.println("Ошибка! Деление на ноль!");
        }
        catch (NumberFormatException exception)
        {
            System.out.println("Ошибка! Не целочисленное!");
        }*/
    }

    public static void main(String[] args)
    {
        Tester tester = new Tester();

        tester.exceptionDemo();
    }
}
