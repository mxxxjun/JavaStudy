package INPUTOUTPUT;

import java.io.FileInputStream;
import java.io.IOException;

public class stringCharset {
    public static void main(String[] args){
        try{
            FileInputStream in = new FileInputStream("애국가.txt");
            byte[] text = new byte[1000];
            int num = in.read(text);
            String utfText = new String(text, "euc-kr");
            System.out.println("읽은 바이트 수 = " + num);
            System.out.println(utfText);
            in.close();
        } catch (IOException e) {}
    }
}
