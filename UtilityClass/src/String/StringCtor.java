package String;

public class StringCtor {
    public static void main(String[] args) {
        String str = new String("아름다운");
        System.out.println(str);

        String str2 = "우리나라";
        System.out.println(str2);

        char[] ar = { 'k', 'o', 'r', 'e', 'a' };
        String str3 = new String(ar);
        System.out.println(str3);
        System.out.println("대한민국".length());
    }
}
