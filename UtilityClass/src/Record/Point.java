package Record;

public class Point {
    private final int x;
    private final int y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    int getX(){return x;}
    int getY(){return y;}

    public boolean equals(Object other){
        if(other instanceof Point == false) return false;
        else return true;
    }
    public int hashCode(){
        return y * 10000 + x;
    }
    public String toString(){
        System.out.println("ToString 메소드 호출");
        return "Point(" + x + "," + y + ")";
    }
}
