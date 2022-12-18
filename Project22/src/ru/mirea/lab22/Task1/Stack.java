package ru.mirea.lab22.Task1;

import java.util.ArrayList;

public class Stack
{
    public static ArrayList<Double> stack = new ArrayList<>();


    public double getStack()
    {
        return stack.get(0);
    }


    public void push(double item)
    {

        stack.add(0,item);

    }


    public double pop()
    {
        return stack.remove(0);
    }
}
