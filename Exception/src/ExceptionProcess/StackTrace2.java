package ExceptionProcess;

public class StackTrace2 {
    public static void main(String[] args){
        method();
    }

    static void method(){
        try{
            submethod();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    static void submethod(){
        int i;
        int a = 3, b = 0;
        i = a / b;
        System.out.println(i);
    }
}
