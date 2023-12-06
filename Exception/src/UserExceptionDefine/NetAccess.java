package UserExceptionDefine;

public class NetAccess implements AutoCloseable{
    public void open(){
        System.out.println("접속");
    }
    public void send(){
        System.out.println("전송");
    }
    public void close(){
        System.out.println("해제");
    }
}

class JavaTest3{
    public static void main(String[] args) throws Exception{
        try(NetAccess na = new NetAccess()){
            na.open();
            na.send();
        }
    }
}
