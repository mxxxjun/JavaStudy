package Generic;

public class genMethod {
    static <T> void print(T a){
        System.out.println(a);
    }

    public static void main(String[] args){
        print(1234);
        print("문자열");
    }
}
