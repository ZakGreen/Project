package ru.mirea.lab13.Task2;

public class Person
{
    private String s_name;
    private String n;
    private String o;

    public String C_String(String s_name, String n, String o)
    {
        if(n == "" || o == "")
        {
            System.out.println("Имя или отчество отсутствуют, данные некорректны!");
            return "";
        }
        else
         return "Person: " + s_name + " " + n + ". " + o + ". ";
    }
}

