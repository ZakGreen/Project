package ru.mirea.lab6.Printable;

import java.util.*;

public class Book implements Printable
{
    public void print()
    {
        System.out.print(String.format("Книга номер: %s\n", new Random().nextInt(1,10)));
        System.out.print(String.format("Журнал номер: %s\n", new Random().nextInt(1,10)));
        System.out.print("\n");
    }
}
