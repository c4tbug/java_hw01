package ru.qa.sandbox;

/**
 * Created by lero on 4/23/16.
 */
public class Point {
    public double x;
    public double y;

    public Point (double x, double y) {
    this.x = x;
    this.y = y;
  }

  public double getDistance(Point p2) {
    return Math.sqrt(Math.pow(p2.x - this.x, 2) + Math.pow(p2.y - this.y, 2));
  }
}