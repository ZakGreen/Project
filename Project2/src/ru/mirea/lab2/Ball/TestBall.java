package ru.mirea.lab2.Ball;

public class TestBall
{
    public static void main(String[] args)
    {
        Ball ball = new Ball();
        System.out.println("Начальное положение мяча: ");
        System.out.println(ball);
        ball = new Ball(80, 60);
        System.out.println("Мяч переместился на: ");
        System.out.println(ball);
        ball.move(10, 20);
        System.out.println("Мяч переместился на: ");
        System.out.println(ball);
    }
}
