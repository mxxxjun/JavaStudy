package String;

public class ChangeCase {
    public static void main(String[] args){
        String str = "Kim Sang Hyung";

        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

        str.toUpperCase();
        System.out.println(str);

        str = str.toLowerCase();
        System.out.println(str);
    }
}
