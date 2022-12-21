package ru.mirea.lab24.Task2;

public class Tester
{
    public static void main(String[] args)
    {

        SuperChair MChair = ChairFactory.getChair("Универсальный", "Пластмасс", "Колесики","Прямая");
        SuperChair VChair = ChairFactory.getChair("Викторианский", "Дерево и ткань", "Изогнутые","Закругленная");
        SuperChair MagicChair = ChairFactory.getChair("Магический", "Кристалл янтаря", "Сферы", "Отсутствует");
        System.out.println(MagicChair);
        Seat(MagicChair);
        System.out.println(VChair);
        Seat(VChair);
        System.out.println(MChair);
        Seat(MChair);
    }

    public static void Seat(SuperChair ch)
    {}
}
