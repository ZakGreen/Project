package ru.mirea.lab18.Task5;

public class Tester
{
    public static String getDetails(String key)
    {
        try
        {
            if(key == null)
            {
                throw new NullPointerException("null key in getDetails");
            }
        }
        catch (Exception exception)
        {
            System.out.println("Ошибка в параметре!");
        }
        return "data for = " + key;
    }

    public static void main(String[] args)
    {
        String test = getDetails(null);

        System.out.println(test);
    }
}
