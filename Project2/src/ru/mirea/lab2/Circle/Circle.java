package ru.mirea.lab2.Circle;

public class Circle
{
    private double radius = 0.0;
    private Point c_point;

    Circle() {
        this.c_point = new Point();
    }
    Circle(double x, double y){
        this.c_point = new Point(x, y);
    }
    Circle(double x, double y, double r)
    {
        this.c_point = new Point(x, y);
        this.radius = r;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(){
        this.radius = radius;
    }

    public void setPoint(double x, double y) {
        this.c_point.setXY(x, y);
    }

    public void setPoint(Point point) {
        this.c_point = point;
    }

    public String toString()
    {
        return
                "Окружность: Радиус = " + radius + " Точка: " + c_point;
    }

}
