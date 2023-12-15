package MultiThread;

public class Runable2 {
    public static void main(String[] args){
        PrintRunable2 print = new PrintRunable2();
        Thread worker = new Thread(print);
        worker.start();

        for(int num=0; num<30; num++){
            System.out.print("0");
            try{
                Thread.sleep(200);
            } catch (InterruptedException e) {}
        }
    }
}

class PrintClass{
    public void printChart(){
        for(int num=0; num < 30; num++){
            System.out.print("X");
            try{
                Thread.sleep(100);
            } catch(InterruptedException e) {}
        }
    }
}

class PrintRunable2 extends PrintClass implements Runnable{
    @Override
    public void run(){
        printChart();
    }
}
