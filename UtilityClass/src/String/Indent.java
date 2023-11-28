package String;

public class Indent {
    public static void main(String[] args){
        String text = "<body>\n<p>sample</p>\n</body>";
        System.out.println(text);
        System.out.println(text.indent(4));
    }
}
