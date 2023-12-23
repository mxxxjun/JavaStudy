package Enum;

enum Direction{EAST, WEST, SOUTH, NORTH}
public class enum2 {
    public static void main(String[] args){
        Direction origin = Direction.EAST;
        origin = Direction.SOUTH;
        if(origin == Direction.WEST) {}
        if(origin == Direction.NORTH) {}
    }
}
