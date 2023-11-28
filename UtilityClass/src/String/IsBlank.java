package String;

public class IsBlank {
    public static void main(String[] args){
        String text = "\t \n";
        System.out.println("isEmpty : " + text.isEmpty());
        System.out.println("isBlank : " + text.isBlank());
    }
}
