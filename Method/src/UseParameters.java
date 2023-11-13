public class UseParameters {
    public static void main(String args[]){
        int num = 2;
        getDouble1(num);
        System.out.println("num = " + num);

        int[] numbers = { 2, 8, 6};
        getDouble2(numbers);
        System.out.println("num[0] = " + numbers[0]);

        System.out.println();

        System.out.println(getSum(1,2));
        System.out.println(getSum(1,2,3,4));
        System.out.println(getSum(8,9,6,2,9));
        System.out.println(getSum());
        System.out.println();

        System.out.println("[3,5] = " + getMax(3,5));
        System.out.println("[3.4, 5.6] = " + getMax(3.4, 5.6));

        int x = 1;
        int y = 11;
        System.out.println(x + "부터 " + y + "까지의 짝수 합 : " + calcSumEven(x,y));
    }

    static int calcSumEven(int a, int b){
        int sum=0;
        for(int i=a; i<=b; i++){
            if(i % 2 == 0) sum += i;
        }
        return sum;
    }

    static double getMax(double a, double b){
        if(a > b) return a;
        else return b;
    }

    static int getMax(int a, int b){
        if(a > b) return a;
        else return b;
    }

    static int getSum(int... a){
        int sum = 0;
        for(int i : a){
            sum += i;
        }
        return sum;
    }

    static void getDouble2(int[] arr){
        arr[0] *= 2;
    }

    static int getDouble1(int num){
        num *= 2;
        return num;
    }
}
