package NestingClass;

class Human7{
    int field;
    static int staticField;

    class Name{
        void method(){
            field=0;
            staticField = 0;
        }
    }

    static class StaticName{
        void method(){
            //field=0;
            staticField = 0;
        }
    }

    void method(){
        Name n = new Name();
        StaticName sn = new StaticName();
    }

    static void staticMethod(){
        //Name n = new Name();
        StaticName sn = new StaticName();
    }
}

public class staticInner2 {
}
