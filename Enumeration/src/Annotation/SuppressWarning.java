package Annotation;

public class SuppressWarning {
    @SuppressWarnings("unused")
    public static void main(String[] args){
        @SuppressWarnings("unused")
        int i;
        System.out.println("프로그램 종료");
    }
}
