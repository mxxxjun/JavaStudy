package INPUTOUTPUT;

import java.io.FileInputStream;
import java.io.IOException;

public class blockRead {
    public static void main(String[] args){
        FileInputStream in = null;
        int data;
        try{
            in = new FileInputStream("test.bin");
            for(;;){
                data = in.read();
                if(data == -1) break;
                System.out.print(data);
            }
        } catch (IOException e) {}
        try{
            in.close();
        } catch (Exception e) {}
    }
}
