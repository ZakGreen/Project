package ru.mirea.lab2.Book;
import java.util.*;

public class Shelf
{
    private List <Book> books = new ArrayList<>();

    Shelf(List <Book> books)
    {
        this.books = books;
    }

    public Book getLatestBook()
    {
        Book latest = books.get(0);
        for (Book b : books)
            if (latest.getYear() < b.getYear())
                latest = b;

        return latest;
    }

    public Book getEarliestBook()
    {
        Book earliest = books.get(0);
        for (Book b : books)
            if (earliest.getYear() > b.getYear())
                earliest = b;

        return earliest;
    }

    public void orderByDate()
    {
        Collections.sort(books, (Book b1, Book b2) -> Integer.signum(b1.getYear() - b2.getYear()));
    }

    @Override
    public String toString()
    {
        return "Книги на полке - " + books;
    }
}
