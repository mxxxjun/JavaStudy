package BoxingAndUnboxing;

public class JavaTestAutoBox {
    public static void main(String[] args){
        Integer a = Integer.valueOf(3);
        Integer b = Integer.valueOf(4);
        int c = a+b;
        System.out.println(c);

        System.out.println();

        Integer d = Integer.valueOf(12);
        d++;
        System.out.println(d);
    }
}
