package Object;

public class JavaTestToString {
    public static void main(String[] args){
        int i = 1234;
        System.out.println(i);

        Human kim = new Human(29, "김상형");
        System.out.println(kim);

        String str = "범인 : " + kim;
        System.out.println(str);
    }
}
