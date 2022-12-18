package ru.mirea.lab18.Task6;

public class Tester
{
    public static String getDetails(String key)
    {
            if(key == null)
            {
                throw new NullPointerException("null key in getDetails");
            }

        return "data for = " + key;
    }

    public static void printMessage(String test)
    {
        try
        {
            getDetails(test);
            System.out.println(test);
        }
        catch (NullPointerException exception)
        {
            System.out.println("Ошибка параметра!");
        }
    }

    public static void main(String[] args)
    {
        String test = getDetails("key");

        printMessage(test);
        //System.out.println(test);
    }
}

