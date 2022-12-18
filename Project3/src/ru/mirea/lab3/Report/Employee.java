package ru.mirea.lab3.Report;

public class Employee
{
    private String fullname;
    private Double salary;

    Employee (String fullname, double salary)
    {
        this.fullname = fullname;
        this.salary = salary;
    }

    public Double getSalary()
    {
        return salary;
    }

    public String getFullname()
    {
        return fullname;
    }

    @Override
    public String toString()
    {
        return "Сотрудник: ФИО - " + fullname + ", " + "Зарплата - " + salary;
    }
}
