package ru.mirea.lab2.Shop;
import java.util.Scanner;

public class TestShop
{
    public static void main(String[] args)
    {
        Shop shop = new Shop();
        Scanner input = new Scanner(System.in);

        while (true)
        {
            System.out.println("Введите что нужно сделать с компьютером: 1 - добавить, 2 - удалить, 3 - найти: ");

            if (!input.hasNextInt())
            {
                input.nextLine();
                continue;
            }

            int a = input.nextInt();

            input.nextLine();

            System.out.println("Введите название компьютера: ");
            String comp = input.nextLine();


            switch (a)
            {
                case 1:
                {
                    shop.addComp(comp);
                    break;
                }
                case 2:
                {
                    shop.deleteComp(comp);
                    break;
                }
                case 3:
                {
                    System.out.println("Найденный компьютер: " + shop.findComp(comp));
                }
            }
        }
    }
}
