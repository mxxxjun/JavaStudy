package Record;

public class RecordPointJavaTest {
    public static void main(String[] args){
        RecordPoint pt = new RecordPoint(123,456);
        System.out.println(pt);

        int x = pt.x();
        int y = pt.y();
        System.out.println("x = " + x + ", y = " + y);

        RecordPoint pt2 = new RecordPoint(123,456);
        System.out.println(pt.equals(pt2));

        RecordPoint pt3 = new RecordPoint(100, 150);
        RecordPoint pt4 = GetMidPoint(pt3);
        System.out.println(pt4);
    }

    public static RecordPoint GetMidPoint(RecordPoint pt){
        return new RecordPoint(pt.x() / 2, pt.y() / 2);
    }
}
