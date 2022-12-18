package ru.mirea.lab2.Shop;

import java.util.*;


public class Shop
{
    private List<String> arr = new ArrayList<>();

    public void addComp(String comp){arr.add(comp);}
    public void deleteComp(String comp){arr.remove(comp);}
    public String findComp(String comp){return arr.contains(comp) ? comp : "Ошибка, такого компьютера нет!";}
}
