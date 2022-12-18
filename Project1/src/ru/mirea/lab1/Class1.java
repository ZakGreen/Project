package ru.mirea.lab1;

public class Class1
{
    public static void main(String[] args)
    {
        double sum=0, sr;
        int[]b = {1,2,3,4,5,6,7,8,9,10};
        for(int i = 0; i<10; i++)
        {
            sum=sum+b[i];
        }
        sr=sum/10;
        System.out.println("Сумма = "+ sum);
        System.out.println("Сред.арифм. = "+ sr);
    }
}
