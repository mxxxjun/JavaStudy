public class SingleThread {
    public static void main(String[] args){
        for(int num=0; num < 30; num++){
            System.out.print("0");
            try{
                Thread.sleep(200);
            } catch(InterruptedException e) {}
        }

        for(int num=0; num<30; num++){
            System.out.print("X");
            try{
                Thread.sleep(100);
            } catch (InterruptedException e){}
        }
    }
}
