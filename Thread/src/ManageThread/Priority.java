package ManageThread;

public class Priority {
    public static void main(String[] args){
        PrintThread1 worker1 = new PrintThread1();
        PrintThread2 worker2 = new PrintThread2();
        worker1.start();
        worker2.setPriority(Thread.MAX_PRIORITY);
        worker2.start();
    }
}

class PrintThread1 extends Thread{
    public void run(){
        double sum = 0;
        for(int i=0; i < 10000000; i++){
            sum += Math.cos(i);
        }
        System.out.println("cos = " + sum);
    }
}

class PrintThread2 extends Thread{
    public void run(){
        double sum = 0;
        for(int i = 0; i < 10000000; i++){
            sum += Math.sin(i);
        }
        System.out.println("sin = " + sum);
    }
}