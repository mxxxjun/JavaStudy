package BoxingAndUnboxing;

public class JavaTestIntBox {
    public static void main(String[] args){

        int i = 1234;

        //Integer를 new를 통해 생성하는 것은 이제 deprecated되었음.
        //Integer wrapint = new Integer(i);
        //String str = wrapint.toString();
        //System.out.println(str);

        Integer wrapint = i;
        Integer wrapint2 = Integer.valueOf(i);

        System.out.println(wrapint);
        System.out.println(wrapint2);

        Integer wrapint3 = Integer.valueOf("629");
        String str = wrapint3.toString();
        int i1 = Integer.parseInt(str);
        System.out.println(i1);

        System.out.println();
        String a = "12", b = "34";
        System.out.println(a + b);
        System.out.println(Integer.parseInt(a) + Integer.parseInt(b));

    }
}
