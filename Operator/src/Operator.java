public class Operator {
    public static void main(String[] args) {
        int a = 6, b = 4;
        System.out.println(a + " + " + b + " = " + (a+b));
        System.out.println(a + " - " + b + " = " + (a-b));
        System.out.println(a + " * " + b + " = " + (a*b));
        System.out.println(a + " / " + b + " = " + (a/b));
        System.out.println(a + " / " + b + " = " + ((float)a/b));

        System.out.println();

        System.out.println("6 %% 4 = " + 6 % 4);
        System.out.println("7 %% 3 = " + 7 % 3);
        System.out.println("5.0 %% 2.3 = " + 5.0 % 2.3);
        System.out.println("14 %% 2 = " + 14 % 2);
        System.out.println("15 %% 2 = " + 15 % 2);

        int value = 2;
        value += 3;
        System.out.println("value = " + value);
        value *= 2;
        System.out.println("value = " + value);

        value = 2;
        a = ++value;
        System.out.println("value = " + value + ", a = " + a);

        value = 2;
        a = value++;
        System.out.println("value = " + value + ", a = " + a);

        System.out.println(4 + 5);
        System.out.println("영구와 " + "땡칠이");
        System.out.println("응답하라 " + 1989);
        System.out.println(1989 + " 응답하라");

        double root2 = 1.414;
        System.out.println("2의 제곱근 : " + root2);

        System.out.println();

        System.out.println("응답하라 " + 19 + 89);
        System.out.println(19 + 89 + " 응답하라");
        System.out.println("" + 19 + 89 + " 응답하라");

        System.out.println();

        value = 8;
        System.out.println(value);
        value = -value;
        System.out.println(value);

        System.out.println();

        value = -8;
        if(value < 0) value = -value;
        System.out.println(value);
    }
}