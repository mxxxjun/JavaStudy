package String;

public class Strip {
    public static void main(String[] args){
        String text = "   korea   ";
        System.out.println("#" + text + "#");
        System.out.println("#" + text.strip() + "#");
    }
}
