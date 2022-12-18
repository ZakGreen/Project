package ru.mirea.lab18.Task1;

public class Tester
{
    public void exceptionDemo()
    {
        try
        {
            System.out.println( 2/0 ); //System.out.println(2.0/0.0);
        }
        catch ( ArithmeticException e )
        {
            System.out.println("Деление на ноль!");
        }
    }

    public static void main(String[] args)
    {
        Tester tester = new Tester();

        tester.exceptionDemo();
    }
}
