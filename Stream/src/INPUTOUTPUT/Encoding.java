package INPUTOUTPUT;

import java.io.FileReader;
import java.io.IOException;

public class Encoding {
    public static void main(String[] args){
        try{
            FileReader in1 = new FileReader("애국가.txt");
            FileReader in2 = new FileReader("애국가-Unicode.txt");
            FileReader in3 = new FileReader("애국가-Utf8.txt");
            FileReader in4 = new FileReader("애국가-Utf8nb.txt");
            char[] text = new char[1000];
            int num = in1.read(text);
            System.out.println("읽은 문자 개수 = " + num);
            System.out.println(text);
            in1.close();
        } catch (IOException e) {

        }

    }
}
