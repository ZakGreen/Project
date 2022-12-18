package ru.mirea.lab2.Dog;

import java.util.*;

public class PitomnikDog
{
    public static void main(String[] args)
    {
        List<Dog> arr = new ArrayList<>();
        Scanner input = new Scanner(System.in);


        while (true)
        {
            System.out.println("Введите кличку и возраст собаки:");

            String name = input.nextLine();

            if (!input.hasNextInt()) {continue;}

           int age = input.nextInt();

            Dog dog = new Dog(name, age);
            arr.add(dog);

            System.out.println(arr);

            input.nextLine();
        }
    }
}
