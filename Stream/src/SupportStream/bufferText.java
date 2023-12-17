package SupportStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class bufferText {
    public static void main(String[] args){
        try{
            BufferedReader in = new BufferedReader(new FileReader("애국가-Utf8nb.txt"));
            char[] text = new char[1000];
            int num = in.read(text);
            System.out.println("읽은 문자 개수 = " + num);
            System.out.println(text);
            in.close();
        } catch (IOException e) {}
    }
}
