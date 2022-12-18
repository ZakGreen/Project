package ru.mirea.lab17.Task2;

public class MVCPatternDemo
{
    public static void main(String[] args)
    {

        Employee model = retiveModel();
        EmployeeView view=new EmployeeView();

        EmployeeController controller = new EmployeeController(model,view);

        controller.updateView();
    }

    private static Employee retiveModel()
    {

        Employee employee = new Employee();

        employee.setSalary(100000);
        employee.setMonth(30);
        employee.setDays(25);
        return employee;
    }
}
