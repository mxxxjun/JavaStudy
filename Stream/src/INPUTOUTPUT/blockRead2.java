package INPUTOUTPUT;

import java.io.FileInputStream;
import java.io.IOException;

public class blockRead2 {
    public static void main(String[] args){
        FileInputStream in = null;
        try{
            in = new FileInputStream("test.bin");
            byte[] data = new byte[2];
            int len;
            for(;;){
                len = in.read(data);
                if(len == -1) break;
                for(byte b : data){
                    System.out.print(b);
                }
            }
        } catch(IOException e) {}
        try{
            in.close();
        } catch(Exception e) {}
    }
}
