package ru.mirea.lab2.Book;

import java.util.*;

public class BookTest
{
    public static void main(String[] args) {
        Shelf shelf = new Shelf(new ArrayList<>(Arrays.asList(new Book("Dmitriy", "99 chinchops", 1337), new Book("Stiven", "Shark", 2042), new Book("Oleg", "Blu sky", 69))));

        System.out.println(shelf);
        System.out.println(shelf.getLatestBook());
        System.out.println(shelf.getEarliestBook());
        shelf.orderByDate();
        System.out.println(shelf);

    }
}
