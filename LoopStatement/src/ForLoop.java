public class ForLoop {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            System.out.println(i + "번 학생 성적 처리");
        }

        int sum = 0;
        for(int i=1; i <=100; i++){
            sum = sum+i;
        }
        System.out.println("합계 = " +sum);

        sum = 0;
        for(int i=1; i <= 100; i = i+2){
            sum = sum +i;
        }
        System.out.println("합계 = " + sum);

        for(int i=10; i>0; i--){
            System.out.print(i + ",");
        }

        System.out.println();

        for(double d=0; d < 3.0; d= d+0.5){
            System.out.print(d + ",");
        }

        System.out.println();

        for(int i=0, j=1; i < 5; i++, j = j+2){
            System.out.println("i = " + i + ", j = " + j);
        }

        for(int i = 1; i <= 5; i++){
            System.out.println(i + "번 학생 성적 처리");
        }
        for(int i=1; i<=3; i++){
            System.out.println(i + "번 과목의 성적 처리");
        }

        sum = 0;
        int i;

        for(i=1; i< 100; i++){
            sum = sum + i;
            if(sum > 100) break;
        }

        System.out.println("합계가 100이 넘는 시점은 " + i + "입니다.");
    }
}