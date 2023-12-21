package SimpleCode;

public class overunder {
    static int[] arAge = {29, 30, 34, 32, 30, 31, 28, 31, 29, 30};

    public static void main(String[] args){
        System.out.println("over = " + countover(30));
        System.out.println("under = " + countunder(30));
    }

    static int countover(int n){
        int num = 0;
        for (int j : arAge) if (j > n) num++;
        return num;
    }

    static int countunder(int n){
        int num = 0;
        for(int j : arAge) if(j < n) num++;
        return num;
    }
}
