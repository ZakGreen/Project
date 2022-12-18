package ru.mirea.lab2.Poker;

import java.util.Scanner;

public class PokerTest
{
    public static void main(String[] args)
    {

        Poker poker = new Poker();

        Scanner input = new Scanner(System.in);
        do
            System.out.println("Введите количество игроков: ");
        while (!input.hasNextInt());

        int n = input.nextInt();

        for (int i = 0; i < n; i++)
            System.out.println(poker.getDeck());
    }
}
