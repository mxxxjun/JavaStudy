package Object;

public class Network {
    void connect(){
        System.out.println("연결되었습니다.");
    }

    void disconnect(){
        System.out.println("연결이 끊어졌습니다.");
    }

    @Override
    protected void finalize() throws Throwable{
        super.finalize();
        disconnect();
    }
}

class JavaTest2{
    public static void main(String[] args){
        communication();
        System.gc();
        System.runFinalization();
    }

    static void communication(){
        Network net = new Network();
        net.connect();
    }
}
