public class Priority {
    public static void main(String args[]){
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;

        if((a == 1 || b == 2) && (c == 10 || d == 10)) System.out.println("진실");
        else System.out.println("거짓");

        a = b = c = d = 5;
        System.out.println(c);

        int milk = 2500;
        int vegemil = 2350;
        int price = milk > vegemil? vegemil:milk;
        System.out.println(price);

        int kor = 85, eng = 92, math = 76;
        int sum = kor + eng + math;
        double avg = (double)sum / 3;
        System.out.println("총점 : " + sum + ", 평균 : " + avg);



    }
}
