package Math;

public class getRandom {
    public static void main(String[] args){
        for(int i = 0; i < 100; i++) System.out.println(getRandom(5, 11));
    }

    static int getRandom(int a, int b){
        return (int)(Math.random() * (b-a)) + a;
    }
}
