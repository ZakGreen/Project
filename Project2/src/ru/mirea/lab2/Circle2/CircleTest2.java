package ru.mirea.lab2.Circle2;

public class CircleTest2
{
    public static void main(String[] args)
    {
        Circle2 circle1 = new Circle2(3);
        Circle2 circle2 = new Circle2(5);

        System.out.println("Площадь окружности (1-ой) = " + circle1.getS());
        System.out.println("Длина окружности (2-ой) = " + circle2.getL());

        System.out.println("Равны ли окружности: " + circle1.equals(circle2));
        System.out.println("Больше ли первая окружность по отношению ко второй: " + circle1.more(circle2));
        System.out.println("Меньше ли первая окружность по отношению ко второй: " + circle1.less(circle2));

    }
}
