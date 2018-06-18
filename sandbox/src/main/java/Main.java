public class Main {

  public static double distance(Point p1, Point p2){
    return Math.sqrt(Math.pow(p2.x -p1.x, 2)+Math.pow(p2.y-p1.y, 2));
  }

  public static void main(String[] args){
    Point p1 = new Point(30, 20);
    Point p2 = new Point(90, 45);

    System.out.println("Расстояние между p1 и p2 =" + distance (p1, p2));
  }
}