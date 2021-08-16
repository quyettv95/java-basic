package lession4;

import java.io.Serializable;

public class Point implements Serializable
{
    int x;
    int y;

    Point() {
        System.out.println("Running on Point Constructor");
    }

    public Point(int x, int y)
    {
        // System.out.println("Running on Point Constructor With 2 param");
        this.x = x;
        this.y = y;
    }

    public Point(String data)
    {
        String dataSeg[] = data.split(",");
        // System.out.println("Running on Point Constructor With 2 param");
        this.x = Integer.valueOf(dataSeg[0]);
        this.y = Integer.valueOf(dataSeg[1]);
    }

    void setX(int xValue)
    {
        this.x = xValue;
    }

    int getX()
    {
        return this.x;
    }

    @Override
    public String toString() {
        return "@Point[x=" + this.x + ",y=" + this.y + "]";
    }

    public void display() {
        System.out.println("X: " + this.x);
        System.out.println("Y: " + this.y);
    }

    double getDistanceFromO() {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }

    public double getDistance(Point p)
    {
        return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2) );
    }

    boolean isInParallelLineWithOX (Point...points)
    {
        for (Point point: points) {
            if (point.y != this.y) {
                return false;
            }
        }
        return true;
    }

    int sum(int...numbers) {
        int sum = 0;
        for(int number: numbers) {
            sum+=number;
        }
        return sum;
    }
}