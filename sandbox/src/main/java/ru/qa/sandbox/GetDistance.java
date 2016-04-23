package ru.qa.sandbox;

public class GetDistance {
  public static void main(String[] args) {

    Point p1 = new Point(2,5);
    Point p2 = new Point(8,10);

    System.out.println("Растояние между двумя точками" + " = " + p1.getDistance(p2));
  }


}

