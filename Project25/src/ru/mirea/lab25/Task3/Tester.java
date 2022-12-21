package ru.mirea.lab25.Task3;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Tester
{
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        System.out.println("Введите Ip-адрес в десятичном виде: ");
        String string = input.nextLine();

        var test = Pattern.compile("^(\\d|\\d\\d|[1]\\d\\d|[2][0-4]\\d|[2][5][0-5])\\.(\\d|\\d\\d|[1]\\d\\d|[2][0-4]\\d|[2][5][0-5])\\.(\\d|\\d\\d|[1]\\d\\d|[2][0-4]\\d|[2][5][0-5])\\.(\\d|\\d\\d|[1]\\d\\d|[2][0-4]\\d|[2][5][0-5])$")
                .matcher(string);
        if(test.find())
            System.out.println("IP - адрес, введен верно!");
        else System.out.println("IP - адрес, введен не верно!");

    }
}
