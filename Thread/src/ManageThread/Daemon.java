package ManageThread;

public class Daemon {
    public static void main(String[] args){
        PrintThread3 worker = new PrintThread3();
        worker.setDaemon(true);
        worker.start();

        for(int i=0; i<20; i++){
            System.out.print(i);
            try{
                Thread.sleep(500);
            } catch (InterruptedException e){}
        }
    }


}

class PrintThread3 extends Thread{
    public void run(){
        while(true){
            System.out.print("save");
            try{
                Thread.sleep(200);
            } catch (InterruptedException e) {}
        }
    }
}