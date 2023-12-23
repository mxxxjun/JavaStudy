package Enum;

public class values {
    public static void main(String[] args){
        Direction[] ways = Direction.values();
        for(Direction way : ways) System.out.print(way + " ");
        System.out.println("중 하나를 선택하시오");
    }
}
