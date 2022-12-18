package ru.mirea.lab3.Report;

import java.util.Scanner;

public class Test
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Report report = new Report();
        for (int i = 0; i < 3; i++)
        {
            System.out.println("Введите ФИО работника: ");
            String name = input.nextLine();
            System.out.println("Введите зарплату работника: ");
            String salary = input.nextLine();
            report.newEmployee(name, Double.parseDouble(salary));
        }
        System.out.println(report.generateReport());
    }
}
