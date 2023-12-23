package Enum;

enum JavaType{
    SHORT("짧은 정수형", 2),
    INT("정수형", 4),
    DOUBLE("실수형", 8);
    private final String typeName;
    private final int length;

    JavaType(String typeName, int length){
        this.typeName = typeName;
        this.length = length;
    }
    public String getTypeName(){
        return typeName;
    }
    public int getLength(){
        return length;
    }
}

public class enumValue2 {
    public static void main(String[] args){
        JavaType type;
        type = JavaType.INT;

        System.out.println("타입 : " + type + ", 이름 : " + type.getTypeName() + ", 길이 : " + type.getLength());
    }
}
