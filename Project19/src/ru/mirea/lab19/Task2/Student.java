package ru.mirea.lab19.Task2;

public class Student
{
    private String sname;
    private String name;
    private int GPA;

    public Student(String name, String sname, int GPA)
    {
        this.sname = sname;
        this.name = name;
        this.GPA = GPA;
    }

    public String getSname()
    {
        return sname;
    }

    public void setSname(String sname)
    {
        this.sname = sname;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getGPA()
    {
        return GPA;
    }

    public void setGPA(int GPA)
    {
        this.GPA = GPA;
    }

    @Override
    public String toString()
    {
        return "Студент: " +
                "Фамилия - " + sname + '\n' +
                "Имя - " + name + '\n' +
                "Средний балл - " + GPA;
    }
}
