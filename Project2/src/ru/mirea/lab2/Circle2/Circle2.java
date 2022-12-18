package ru.mirea.lab2.Circle2;

public class Circle2
{
    private double r;

    Circle2 (double r) {
        this.r = r;
    }

    public double getS(){
        return Math.PI * Math.pow(r, 2);
    }

    public double getL() {
        return 2 * Math.PI * r;
    }

    public boolean equals(Circle2 compare) {
        return this.r == compare.r;
    }
    public boolean less(Circle2 compare) {
        return this.r < compare.r;
    }

    public boolean more(Circle2 compare) {
        return !(this.less(compare) || this.equals(compare));
    }
}
