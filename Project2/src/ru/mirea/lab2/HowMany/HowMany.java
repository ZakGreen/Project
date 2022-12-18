package ru.mirea.lab2.HowMany;

import java.util.Scanner;

public class HowMany
{
    public static void main (String[] args)
    {
        int counter = 0;
        Scanner input = new Scanner(System.in);
        while (input.nextLine() != "")
        {
            counter++;
        }
        System.out.println("Число введёных слов = " + counter);
    }
}
