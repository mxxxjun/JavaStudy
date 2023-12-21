package UtilizeLambda;

public class lambdaThread {
    public static void main(String[] args){
        Thread worker = new Thread( () -> System.out.println("스레드가 출력할 문장"));
        worker.start();
    }
}
