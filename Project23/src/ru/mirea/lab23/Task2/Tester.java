package ru.mirea.lab23.Task2;

public class Tester
{
    public static void main(String[] args)
    {
        System.out.println("Тест очереди:" );
        ArrayQueue queue = new ArrayQueue();// Создание очереди

        for (int i = 1; i < 6; i++)                         //Добавление элементов в очередь
            queue.enqueue(i);

        for (int i = 0; i < queue.size(); i++)               // Вывод элемента который удалили, а затем вернули в очередь
            System.out.println(queue.dequeue());


        queue.clear();

        System.out.println("Пуста ли очередь: " + queue.isEmpty());

        queue.enqueue(777);
        System.out.println(queue.element());


        System.out.println("\n"+"Тест Linked: ");
        LinkedQueue<String> list = new LinkedQueue<>();

        list.add("A");
        list.add("Б");
        list.add("В");

        for (Object lin : list)
        {
            System.out.println(lin);
        }

    }
}
