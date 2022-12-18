package ru.mirea.lab3.Format;

import java.util.*;
import java.text.NumberFormat;

public class Convertor
{
    public static void main(String[] args)
    {
            Formatter format = new Formatter();
            Scanner input = new Scanner(System.in);
            System.out.println("Выберите одну из функций: ");
            System.out.println("1 - Перевод из Рублей в Доллары. ");
            System.out.println("2 - Перевод из Рублей в Евро. ");
            System.out.println("3 - Перевод из Долларов в Рубли. ");
            System.out.println("4 - Перевод из Евро в Рубли. ");
            System.out.println("5 - Перевод из Долларов в Евро. ");
            System.out.println("6 - Перевод из Евро в Доллары.");
            int a = input.nextInt();
            switch (a)
            {
                case 1:
                {
                    System.out.println("Введите сумму в Рублях: ");
                    double rub = input.nextDouble();
                   Locale usa = new Locale("usa");
                    NumberFormat num = NumberFormat.getCurrencyInstance(Locale.US);
                    if (rub >= 0)
                    {
                        format.format("В Долларах это будет: %s", num.format(rub * 0.017009));
                        System.out.println(format);
                    }
                    else
                    {
                        System.out.println("Ошибка! Вы ввели некорректную сумму!");
                    }
                }
                break;
                case 2:
                {
                    System.out.println("Введите сумму в Рублях: ");
                    double rub = input.nextDouble();
                    NumberFormat num = NumberFormat.getCurrencyInstance(Locale.FRANCE);
                    if (rub >= 0)
                    {
                        format.format("В Евро это будет: %s", num.format(rub * 0.017802));
                        System.out.println(format);
                    }
                    else
                    {
                        System.out.println("Ошибка! Вы ввели некорректную сумму!");
                    }
                }
                break;
                case 3:
                {
                    System.out.println("Введите сумму в Долларах: ");
                    double dol = input.nextDouble();
                     //NumberFormat num = NumberFormat.getCurrencyInstance()
                    if (dol >= 0)
                    {
                        format.format("В Рублях это будет: %s", dol * 58.79);
                        System.out.println(format);
                    }
                    else
                    {
                        System.out.println("Ошибка! Вы ввели некорректную сумму!");
                    }
                }
                break;
                case 4:
                {
                    System.out.println("Введите сумму в Евро: ");
                    double evr = input.nextDouble();
                    // NumberFormat num = NumberFormat.getCurrencyInstance()
                    if (evr >= 0)
                    {
                        format.format("В Рублях это будет: %s", evr * 56.17);
                        System.out.println(format);
                    }
                    else
                    {
                        System.out.println("Ошибка! Вы ввели некорректную сумму!");
                    }
                }
                break;
                case 5:
                {
                    System.out.println("Введите сумму в Долларах: ");
                    double dol = input.nextDouble();
                    NumberFormat num = NumberFormat.getCurrencyInstance(Locale.FRANCE);
                    if (dol >= 0)
                    {
                        format.format("В Евро это будет: %s", num.format(dol * 1.01));
                        System.out.println(format);
                    }
                    else
                    {
                        System.out.println("Ошибка! Вы ввели некорректную сумму!");
                    }
                }
                break;
                case 6:
                {
                    System.out.println("Введите сумму в Евро: ");
                    double evr = input.nextDouble();
                    NumberFormat num = NumberFormat.getCurrencyInstance(Locale.US);
                    if (evr >= 0)
                    {
                        format.format("В Долларах это будет: %s", num.format(evr * 0.9941));
                        System.out.println(format);
                    }
                    else
                    {
                        System.out.println("Ошибка! Вы ввели некорректную сумму!");
                    }
                }
                break;
            }
            input.close();
    }
}
