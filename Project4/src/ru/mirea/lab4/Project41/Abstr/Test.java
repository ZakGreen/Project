package ru.mirea.lab4.Project41.Abstr;
import java.util.*;

public class Test
{
    public static void main(String[] args)
    {
        double radius;
        String color = "красный";
        double width;
        double length;
        double side;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите радиус окружности: ");
        radius = input.nextDouble();
        Circle circle = new Circle(color, true, radius);
        System.out.println("Окружность: " + circle.toString());
        System.out.println("Длина окружности - " + circle.getPerimeter());
        System.out.println("Площадь окружности - " + circle.getArea());

        System.out.println("\n");

        System.out.println("Введите ширину прямоугольника: ");
        width = input.nextDouble();
        System.out.println("Введите длину прямоугольника: ");
        length = input.nextDouble();
        Rectangle rectangle = new Rectangle(color, false, width, length);
        System.out.println("Прямоугольник: " + rectangle.toString());
        System.out.println("Периметр прямоугольника - " + rectangle.getPerimeter());
        System.out.println("Площадь прямоугольника - " + rectangle.getArea());

        System.out.println("\n");

        System.out.println("Введите сторону квадрата: ");
        side = input.nextDouble();
        Square square = new Square(color, true, side);
        square.setColor("синий");
        square.setWidth(side);
        square.setLength(side);
        System.out.println("Квадрат: " + square.toString());
        System.out.println("Периметр квадрата - " + square.getPerimeter());
        System.out.println("Площадь квадрата - " + square.getArea());
    }
}

