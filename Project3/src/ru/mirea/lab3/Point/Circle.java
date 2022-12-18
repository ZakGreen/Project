package ru.mirea.lab3.Point;

public class Circle implements Comparable<Circle>
{
    private int radius = 0;
    private Point c_point;

    Circle() {
        this.c_point = new Point();
    }
    Circle(double x, double y){
        this.c_point = new Point(x, y);
    }
    Circle(double x, double y, int r)
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
                "Радиус = " + radius + c_point;
    }

    @Override
    public int compareTo(Circle o)
    {
        return (int) (this.getRadius()-o.getRadius());
    }
}
