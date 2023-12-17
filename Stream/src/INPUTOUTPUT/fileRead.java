package INPUTOUTPUT;

import java.io.FileInputStream;
import java.io.IOException;

public class fileRead {
    public static void main(String[] args){
        FileInputStream in = null;
        try{
            in = new FileInputStream("test.bin");
            int avail = in.available();
            System.out.println(avail);
            byte[] data = new byte[avail];
            in.read(data);
            in.close();
            for(byte b : data) System.out.print(b);
        } catch (IOException e) {
            System.out.println("에러 발생");
        }
    }
}
