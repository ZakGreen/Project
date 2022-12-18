package ru.mirea.lab19.Task2;

import java.util.Scanner;

public class Tester
{
    static  boolean search = false;

    public static Student[] arr =
            {
                    new Student("Грегори", "Прайз", 45  ),
                    new Student("Бобс", "Шир",73  ),
                    new Student("Владимир", "Смирнов",66),
                    new Student("Адам", "Чернов",100 ),
                    new Student("Дмитрий", "Первый", 53)
            };

    public static void main(String[] args) throws M_Exception
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите студента: ");
        String surname = input.nextLine();
        findUser(surname);
    }

    private static void findUser(String surname) throws M_Exception
    {

        try
        {
            String[] split = surname.split(" ");
            for (int i = 0; i < arr.length; i++)
            {
                if (split[1].equals(arr[i].getSname()))
                {
                    search = true;
                    if ((arr[i].getName().equals(split[0])))
                     {
                         System.out.println(arr[i].toString());
                     }
                    else
                    search = false;
            }
        }
                if (!search)
                     {
                          throw new M_Exception("Студент не найден!");
                     }
        }
        catch (ArrayIndexOutOfBoundsException exception)
        {
            System.out.println("ФИ студента некорректны!");
        }

    }
}
