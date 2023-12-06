package ExceptionProcess;

public class PolyEx {
    public static void main(String[] args){
        int a,b,c;
        a = 5;
        b = 2;
        int[] ar = {1,2,3,4,5};

        try{
            c = a/b;
            System.out.println("c = " + c);
            ar[5] = 100;
        }
        catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("프로그램 실행 완료");
    }
}
