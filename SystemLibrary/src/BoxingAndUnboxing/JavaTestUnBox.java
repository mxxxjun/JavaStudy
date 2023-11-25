package BoxingAndUnboxing;

public class JavaTestUnBox {
    public static void main(String[] args){
        Integer wrapint = Integer.valueOf(629);
        int i = wrapint.intValue();
        System.out.println(i);

        Double wrapDouble = Double.valueOf("3.14");
        int di = wrapDouble.intValue();
        System.out.println(di);
    }
}
