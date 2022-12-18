package ru.mirea.lab9.MyCompare;

import java.util.TreeSet;

public class Test implements Comparable<Object>
{
    String str;
    int num;
    String  TEMPLATE = "Число = %d, Буква = '%s'";

    Test(String str, int num)
    {
        this.str = str;
        this.num = num;
    }

    @Override
    public int compareTo(Object obj)
    {
        Test entry = (Test) obj;
        int result = str.compareTo(entry.str);
        if(result != 0)
            return result;
        result = num - entry.num;
        if(result != 0)
            return (int) result / Math.abs( result );

        return 0;
    }

    @Override
    public String toString()
    {
        return String.format(TEMPLATE, num, str);
    }

    public static void main(String[] args)
    {
        TreeSet<Test> data = new TreeSet<Test>();
        data.add(new Test("А", 234));
        data.add(new Test("Г", 132));
        data.add(new Test("Д", 357));
        data.add(new Test("Б", 246));
        data.add(new Test("В", 789));
        for (Test e : data)
            System.out.println(e.toString());
    }
}
