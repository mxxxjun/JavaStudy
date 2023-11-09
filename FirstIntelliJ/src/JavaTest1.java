import java.util.Scanner;

public class JavaTest1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("이름을 입력하시오 : ");
        String name = scanner.nextLine();
        System.out.println("안녕하세요 " + name + "님.");

        System.out.print("나이를 입력하시오 : ");
        int age = scanner.nextInt();
        System.out.println("당신은 " + age + "살입니다.");

        scanner.close();
    }
}
