package Record;

public class PointJavaTest {
    public static void main(String[] args){
        Point pt = new Point(123, 456);
        System.out.println(pt);

        int x = pt.getX();
        int y = pt.getY();
        System.out.println("x = " + x + ",y = " + y);

        Point pt2 = new Point(123, 457);
        System.out.println(pt.equals(pt2));
    }
}
