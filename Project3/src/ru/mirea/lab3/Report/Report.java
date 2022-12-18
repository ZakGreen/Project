package ru.mirea.lab3.Report;


import java.util.*;

public class Report
{
    private static List<Employee> arr = new ArrayList<>();

    public void  newEmployee(String name, double salary)
    {
        arr.add(new Employee(name, salary));
    }

    public static String generateReport()
    {
        StringBuilder report = new StringBuilder();
        report.append(String.format("%-20s%20s%n", "Name", "Salary"));
        for (Employee e: arr)
            report.append(String.format("%-20s%20.2f%n", e.getFullname(), e.getSalary().doubleValue()));
        return report.toString();
    }
}
