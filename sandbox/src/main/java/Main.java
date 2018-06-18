public class Main {

  public static double distance(Point p1, Point p2){
    return Math.sqrt(Math.pow(p2.x -p1.x, 2)+Math.pow(p2.y-p1.y, 2));
  }

  public static void main(String[] args){
    Point p1 = new Point();
    p1.x = 30;
    p1.y = 20;
    Point p2 = new Point();
    p2.x = 90;
    p2.y = 45;
    System.out.println("Расстояние между p1 и p2 =" + distance (p1, p2));
  }
}