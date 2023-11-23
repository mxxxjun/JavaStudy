package kr.soen.library;

public class Util {
    public static void mpublic() {System.out.println("public Method");}
    private static void mprivate() {System.out.println("private Method");}
    protected static void mprotected() {System.out.println("protected Method");}
    static void mdefault() {System.out.println("default Method");}

    void method(){
        mpublic();
        mprivate();
        mprotected();
        mdefault();
    }
}

class UseUtil {
    void method(){
        Util.mpublic();
        //Util.mprivate();
        Util.mprotected();
        Util.mdefault();
    }
}
