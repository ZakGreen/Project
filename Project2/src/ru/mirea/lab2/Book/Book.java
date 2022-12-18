package ru.mirea.lab2.Book;

public class Book
{
    private String author;
    private String name;
    private int year;

    Book (String author, String name, int year)
    {
        this.author = author;
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString()
    {
        return "Книга: Автор - " + author + ", Название книги - " + name + ", Год выпуска - " + year;
    }
}
