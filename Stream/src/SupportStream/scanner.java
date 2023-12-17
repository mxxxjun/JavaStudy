package SupportStream;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args){
        System.out.println("정수를 입력하시오 : ");
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        scan.close();
        System.out.println("입력 값의 2배 = " + i*2);
    }
}
