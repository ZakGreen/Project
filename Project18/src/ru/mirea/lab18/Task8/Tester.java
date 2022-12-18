package ru.mirea.lab18.Task8;

import java.util.Objects;
import java.util.Scanner;

public class Tester
{
    public static void printDetails(String key)
    {
        try
        {
            String message = getDetails(key);
            System.out.println( message );
        }
        catch ( Exception e)
        {
            throw e;
        }
    }
    public static String getDetails(String key)
    {

        if(Objects.equals(key, ""))
        {
            try
            {
                throw new Exception("Key set to empty string");
            }
            catch (Exception e)
            {
                throw new RuntimeException(e);
            }

        }
        return "data for = " + key;
    }

    public static void getKey()
    {
        String key="";
        for (int i=0; i<2; i++)
        {
            Scanner myScanner = new Scanner( System.in);

            try
            {
                key = myScanner.nextLine();
                printDetails( key );
            }
            catch (Exception exception)
            {
                if(i!=1)
                {System.out.println("Ошибка! Введите значение повторно: ");}
                else
                {System.out.println("Ошибка так и не была исправлена!");}
            }

        }

    }
    public static void main(String[] args)
    {
        getKey();
    }
}
