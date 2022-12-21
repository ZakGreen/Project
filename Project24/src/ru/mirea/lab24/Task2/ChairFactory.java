package ru.mirea.lab24.Task2;

import ru.mirea.lab24.Task2.SuperChair;
import ru.mirea.lab24.Task2.MagicalChair;
import ru.mirea.lab24.Task2.VictorianChair;
import ru.mirea.lab24.Task2.MultifunctionalChair;


public class ChairFactory
{
    public static SuperChair getChair(String type, String material, String legs, String back)
    {
        if("Викторианский".equalsIgnoreCase(type))
            return new VictorianChair(material, legs, back);
        else if ("Универсальный".equalsIgnoreCase(type))
            return new VictorianChair(material, legs, back);
        else if ("Магический".equalsIgnoreCase(type))
            return new VictorianChair(material, legs, back);
        else
            return null;
    }
}
