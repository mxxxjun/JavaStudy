import java.util.Scanner;

public class NestedLoop {
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        int grade;

        for(int i=1; i <= 9; i++){
            for(int j=1; j<=9; j++){
                System.out.println(i + " * " + j + " = " + i*j);
            }
            System.out.println();
        }

        for(;;){
            System.out.println("몇 학년입니까?(1~6) : ");
            grade = scanner.nextInt();
            if(grade >= 1 && grade <= 6) break;
            System.out.println("다시 입력하시오");
        }
        System.out.println(grade + "학년입니다.");

        int num = (int)(Math.random() * 10) + 1;
        for(;;){
            System.out.println("숫자를 맞춰 보세요(1~10) : ");
            int input = scanner.nextInt();
            if(input == num){
                System.out.println("정답입니다.");
                break;
            } else if(input > num){
                System.out.println(input + "보다 작은 숫자입니다.");
            } else{
                System.out.println(input + "보다 큰 숫자입니다.");
            }
        }

        scanner.close();

        for(int i=1; i <= 10; i++){
            for(int j=0; j<i; j++){
                System.out.print('*');
            }
            System.out.println();
        }

        System.out.println();

        for(int i=10; i > 0; i--){
            for(int j=0; j<i; j++){
                System.out.print('*');
            }
            System.out.println();
        }

        for(int i=10; i>0; i--){
            for(int j=1; j<=10; j++){
                if(i>j) System.out.print(" ");
                else System.out.print('*');
            }
            System.out.println();
        }

        for(int i=10; i>0; i--){
            for(int j=1; j<=10; j++){
                if(i>j) System.out.print(" ");
                else System.out.print('*');
            }
            for(int k=0; k<10-i; k++){
                System.out.print('*');
            }
            System.out.println();
        }

        double pie = 0;
        boolean plus = true;
        for(int deno = 1; deno < 1000; deno += 2){
            if(plus){
                pie = pie + 1.0/deno;
                plus = false;
            } else{
                pie = pie - 1.0/deno;
                plus = true;
            }
        }
        pie *= 4;
        System.out.println("pie = " + pie);

        pie = 0;
        int sign = 1;
        for(int deno = 1; deno < 1000; deno+=2){
            pie = pie + (1.0/deno) * sign;
            sign = -sign;
        }
        pie *= 4;
        System.out.println("pie = " + pie);

        pie = 0;
        for(int deno = 1; deno < 1000; deno += 4){
            pie = pie + (1.0/deno) - (1.0/(deno + 2));
        }
        System.out.println("pie = " + pie * 4);

        for(int end = 10; end <= 10000000; end *= 10){
            pie = 0;
            for(int deno =1; deno < end; deno += 4){
                pie = pie + (1.0/deno) - (1.0/(deno+2));
            }
            System.out.println("pie = " + pie * 4 + "(" + end + "회)");
        }

        pie = 0;
        for(int deno = 1; deno < 1000; deno++){
            pie = pie + (1.0/(deno * deno));
        }
        pie = Math.sqrt(pie * 6);
        System.out.println("pie = " + pie);

        for(int end = 10; end <= 10000000; end *= 10){
            pie = 0;
            for(long deno = 1; deno < end; deno++){
                pie = pie + (1.0/(deno*deno));
            }
            pie = Math.sqrt(pie * 6);
            System.out.println("pie = " + pie + "(" + end + "회)");
        }
    }
}
