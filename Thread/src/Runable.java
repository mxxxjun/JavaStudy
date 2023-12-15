public class Runable {
    public static void main(String[] args){
        PrintRunable2 print = new PrintRunable2();
        Thread worker = new Thread(print); //상속 받고 대입
        worker.start(); //이 스레드는 아래의 for문과 동시에 진행된다.

        for(int num=0; num<30; num++){
            System.out.print("0");
            try{
                Thread.sleep(200);
            } catch (InterruptedException e){}
        }

        for(int num=0; num<20; num++) System.out.println("PP");
    }
}

class PrintRunable implements Runnable{

    @Override
    public void run() {
        for(int num = 0; num < 30; num++){
            System.out.print("X");
            try{
                Thread.sleep(100);
            } catch (InterruptedException e){;}
        }
    }
}