package Enum;

import java.security.Key;

enum Direction2{
    EAST("동쪽"),
    WEST("서쪽"),
    SOUTH("남쪽"),
    NORTH("서쪽");

    private final String korean;
    //private final 과 final private 의 차이가 뭔가? 똑같다. 차이가 없다.
    Direction2(String korean){
        this.korean = korean;
    }

    public String getKorean(){
        return this.korean;
    }
}

public class enumValue {
    public static void main(String[] args){
        Direction2 origin = Direction2.EAST;
        System.out.println(origin.getKorean() + "으로 갑시다.");
    }
}
