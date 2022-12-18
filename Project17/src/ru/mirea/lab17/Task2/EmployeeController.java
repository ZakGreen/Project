package ru.mirea.lab17.Task2;

public class EmployeeController
{
    private Employee model;
    private EmployeeView view;

    public EmployeeController(Employee model, EmployeeView view)
    {
        this.model = model;
        this.view = view;
    }

    public void setSalary(int salary)
    {
        model.setSalary(salary);
    }

    public void setMonth(int month)
    {
        model.setMonth(month);
    }

    public void setDays(int days)
    {
        model.setDays(days);
    }

    public int getSalary()
    {
        return model.getSalary();
    }

    public int getMonth()
    {
        return model.getMonth();

    }

    public int getDays()
    {
        return model.getDays();
    }

    public void updateView()
    {
        view.print(model.getSalary(), model.getMonth(), model.getDays());
    }
}
