package ru.mirea.lab17.Task2;

public class EmployeeView
{
    public void print(int salary, int month, int day)
    {
        System.out.println("Зарплата сотрудника: " + (salary/month)*day);
    }
}
