public class LogicalOperator {
    public static void main(String args[]){
        int value = 7;

        if(value > 5 && value < 10) System.out.println("범위 안에 있음");
        else System.out.println("범위 안에 없음");

        value = -5;

        System.out.println("절댓값 = " + (value > 0 ? value : -value));

        value = 3;
        System.out.println("value는 " + (value % 2 == 0 ? "짝" : "홀") + "수 입니다.");
    }
}
