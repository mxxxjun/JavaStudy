package ManageThread;

public class Suspend {
}

class JavaTest{
    public static void main(String[] args){
        PrintThread worker = new PrintThread();
        worker.start();

        for(int num=0; num < 30; num++){
            System.out.print("O");
            try{
                Thread.sleep(200);
            } catch (InterruptedException e){}
            //if(num == 5) worker.suspend(); deprecated 되었음
            //if(num == 25) worker.resume(); deprecated 되었음
        }
    }
}

class PrintThread extends Thread{
    public void run(){
        for(int num=0; num < 30; num++){
            System.out.print("X");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
