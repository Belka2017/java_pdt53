public class Main {

    public static void main(String[] args) {
        Point p1=new Point(25,30);
        Point p2=new Point(95,50);

        System.out.println( "Расстояние между точками P1 и P2 составляет =" + Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.x - p2.y, 2)));
    }
    public static double distance (Point p1, Point p2) {
        return (Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.x - p2.y, 2)));
    }
}