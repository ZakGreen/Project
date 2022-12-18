package ru.mirea.lab20.Task4;

public class Tester
{
    public static void main(String[] args)
    {
        Integer[] arr = {9,2,11,4,5,0};

        MinMax object = new MinMax<Integer>(arr);

        object.SortMax();
        object.SortMin();

        System.out.println("Сложение: " + Calculator.sum(25,15));
        System.out.println("Вычитание: " + Calculator.subtraction(50,5));
        System.out.println("Умножение: " + Calculator.multiply(2,7));
        System.out.println("Деление: " + Calculator.divide(70,4));
    }
}
