package UserExceptionDefine;

public class AutoClose {
    public void open(){System.out.println("접속");}
    public void send(){System.out.println("전송");}
    public void close(){System.out.println("해제");}
}

class JavaTest2{
    public static void main(String[] args){
        AutoClose autoClose = new AutoClose();
        try{
            autoClose.open();
            autoClose.send();
        }
        finally {
            autoClose.close();
        }
    }
}
