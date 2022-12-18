package ru.mirea.lab20.Task1_2_3;

import java.io.Serializable;

public class Main_class <T,V,K> implements Comparable<T>, Serializable
{
    private T t;
    private V v;
    private K k;

    public Main_class(T t, V v, K k)
    {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getParametrs()
    {
        return t;
    }

    public void Print()
    {
        System.out.println(t.getClass().getSimpleName());
        System.out.println(v.getClass().getSimpleName());
        System.out.println(k.getClass().getSimpleName());
    }

    @Override
    public int compareTo(T o)
    {
        return 0;
    }
}