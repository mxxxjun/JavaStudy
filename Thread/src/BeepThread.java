import java.awt.*;

public class BeepThread extends Thread{
    int count;
    int gap;
    Toolkit tool = Toolkit.getDefaultToolkit();
    BeepThread(int count, int gap){
        this.count = count;
        this.gap = gap;
    }
    public void run(){
        for(int num=0; num < count; num++){
            tool.beep();
            try{
                Thread.sleep(gap);
            } catch(InterruptedException e) {}
        }
    }
}

class PrintThread3 extends Thread{
    char ch;
    PrintThread3(char ch){
        super();
        this.ch = ch;
    }
    public void run(){
        for(int num=0; num<30; num++){
            System.out.print(ch);
            try{
                Thread.sleep(100);
            } catch(InterruptedException e) {}
        }
    }
}

class JavaTest3{
    public static void main(String[] args){
        PrintThread3 worker1 = new PrintThread3('X');
        worker1.start();
        PrintThread3 worker2 = new PrintThread3('.');
        worker2.start();
        BeepThread beep = new BeepThread(5, 1000);
        beep.start();

        for(int num=0; num<30; num++){
            System.out.print("0");
            try{
                Thread.sleep(100);
            } catch (InterruptedException e) {}
        }
    }
}