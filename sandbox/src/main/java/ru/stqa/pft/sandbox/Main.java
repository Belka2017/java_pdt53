package ru.stqa.pft.sandbox;

public class Main {

  public static void main(String[] args){
    Point p1 = new Point(30, 20);
    Point p2 = new Point(90, 45);

    System.out.println("Расстояние между p1 и p2 =" + p1.distance (p2));
  }
}