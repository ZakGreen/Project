package ru.mirea.lab23.Task1;

public class Tester
{
    public static void main(String[] args)
    {
        ArrayQueueADT queue = new ArrayQueueADT();

        System.out.println("Тест ADT:");
        for (int i = 1; i < 6; i++)
        {
            ArrayQueueADT.enqueue(queue, i);
        }

        for (int i = 1; i < 6; i++)
        {
            System.out.println(ArrayQueueADT.dequeue(queue));
        }

        System.out.println("Тест Module: ");
        for (int i=1;i<6; i++)
            ArrayQueueModule.enqueue(i);

        for (int i=1;i<6; i++)
            System.out.println(ArrayQueueModule.dequeue());

    }
}
