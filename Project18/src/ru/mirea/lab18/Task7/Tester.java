package ru.mirea.lab18.Task7;

import java.util.Objects;
import java.util.Scanner;

public class Tester
{
    public void getKey()
    {
        Scanner myScanner = new Scanner(System.in);
        String key = myScanner.nextLine();
        printDetails( key );
    }
    public static void printDetails(String key)
    {
        try
        {
            String message = getDetails(key);
            System.out.println(message);
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

    public static void main(String[] args)
    {
       Tester tester = new Tester();
       tester.getKey();
    }
}
