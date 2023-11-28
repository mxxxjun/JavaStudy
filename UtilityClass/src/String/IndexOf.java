package String;

public class IndexOf {
    public static void main(String[] args){
        String str = "String Search Method of String Class";

        System.out.println("앞쪽 t = " + str.indexOf('t'));
        System.out.println("뒤쪽 t = " + str.lastIndexOf('t'));
        System.out.println("앞쪽 z = " + str.indexOf('z'));
        System.out.println("앞쪽 String = " + str.indexOf("String"));
        System.out.println("뒤쪽 String = " + str.lastIndexOf("String"));
    }
}
