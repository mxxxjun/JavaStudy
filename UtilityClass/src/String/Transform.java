package String;

public class Transform {
    public static void main(String[] args){
        String text = "korea";
        System.out.println((String) text.transform(t -> t + " hello"));
        String num = "12";
        System.out.println(num.transform(Integer::parseInt) * 2);
    }
}
