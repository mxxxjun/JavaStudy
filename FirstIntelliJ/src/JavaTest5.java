public class JavaTest5 {
    public static void main(String args[]){
        char yen = '\u00a5';
        System.out.print(yen);
        char omega = '\u03c9';
        System.out.print(omega);
        System.out.print('\n');
        char quot = '\'';
        System.out.println(quot);

        /*
        char 변수형은 유니코드를 사용하여 데이터를 저장한다.
        형식은 \'uxxxx와 같은 방식으로 사용된다. xxxx부분에 16진수의 조합으로 사용된다.
         */
    }
}
