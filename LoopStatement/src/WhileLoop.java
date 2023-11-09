import java.util.Scanner;

public class WhileLoop {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int filesize = 720;
        int download = 0;

        while(download < filesize){
            download += 120;
            System.out.println(download + "K 다운로드중....");
        }

        System.out.println("다운로드 완료");

        int sum = 0;
        int i = 1;
        while(i <= 100){
            sum += i;
            i++;
        }
        System.out.println(sum);

        filesize = 720;
        for(download = 0; download < filesize; download += 120){
            System.out.println(download + "K 다운로드중....");
        }
        System.out.println("다운로드 완료");

        int num;
        sum = 0;
        do{
            System.out.println("숫자를 입력하세요(끝낼 때 0) : ");
            num = scanner.nextInt();
            sum += num;
        } while(num != 0);

        System.out.println("총 합계 = " + sum);
        scanner.close();

        int[] score = {88, 94, 72, -8, 23};
        for(i=0; i<5; i++){
            if(score[i] < 0 || score[i] > 100) break;
            System.out.println( (i+1) + "번 학생의 성적 : " + score[i] );
        }

        for(i=1; i<=9; i++){
            for(int j=1; j <= 9; j++){
                if(i == 2 && j == 3) break;
                System.out.println(i + " * " + j + " = " + i*j);
            }
            System.out.println();
        }

        dan:
        for(i=1; i<=9; i++){
            for(int j=1; j <= 9; j++){
                if(i == 2 && j == 3) break dan;
                System.out.println(i + " * " + j + " = " + i*j);
            }
            System.out.println();
        }

        int[] scores = {88, 94, -1, 79, 23};
        for(i=0; i<5; i++){
            if(scores[i] == -1) continue;
            System.out.println( (i+1) + "번 학생의 성적 : " + scores[i] );
        }

        int s=0;
        for(int j=10; j<=50; j++){
            s += j;
            System.out.println(s);
        }
        System.out.println(s);

        for(char j='a'; j<='j'; j++){
            for(char k='a'; k<=j; k++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
