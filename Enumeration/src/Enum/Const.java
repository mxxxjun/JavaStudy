package Enum;

public class Const {
    public static void main(String[] args){
        final int EAST = 1;
        final int WEST = 2;
        final int SOUTH = 3;
        final int NORTH = 4;

        int origin = EAST;
        origin = SOUTH;
        if(origin==WEST) {}
        if(origin != NORTH) {}
    }
}
