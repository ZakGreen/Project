package ru.mirea.lab14.Task2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tester
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите строку (верная - abcdefghijklmnopqrstuv18340): ");
        String string = input.nextLine();

        Pattern pattern = Pattern.compile("abcdefghijklmnopqrstuv18340");
        Matcher matcher = pattern.matcher(string);

        boolean b = matcher.matches();

        if(b == true)
        {
            System.out.println("Строки совпадают!");
        }
        else System.out.println("Строки не совпадают!");

    }
}

