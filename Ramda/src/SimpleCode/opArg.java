package SimpleCode;

public class opArg {
    static int[] arAge = {29, 30, 34, 32, 30, 31, 28, 31, 29, 30};

    public static void main(String[] args){
        System.out.println("equal = " + count(0, 30));
        System.out.println("over = " + count(1, 30));
        System.out.println("under = " + count(2, 30));
    }

    static int count(int cases, int num){
        int cnt = 0;
        for(int j : arAge){
            switch (cases){
                //Equal
                case 0 -> {
                    if(j == num) cnt++;
                }
                //Over
                case 1 -> {
                    if(j > num) cnt++;
                }
                //Under
                case 2 -> {
                    if(j < num) cnt++;
                }
            }
        }
        return cnt;
    }
}
