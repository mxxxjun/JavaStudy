package INPUTOUTPUT;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class textWrite {
    public static void main(String[] args){
        String str = "자바 Stream 입출력";
        try{
            FileWriter out = new FileWriter("test.txt");
            out.write(str); //저장은 한꺼번에 되네!!
            out.close();
            System.out.println("Write success");
        } catch(IOException e) {}

        //한 문자씩 읽기
        try{
            FileReader in = new FileReader("test.txt");
            int ch;
            for(;;){
                ch = in.read();
                if(ch == -1) break;
                System.out.print((char) ch);
            }
            in.close();
            System.out.println();
        } catch (Exception e) {}

        //한꺼번에 읽기
        try{
            FileReader in = new FileReader("test.txt");
            char[] text = new char[100];
            int num = in.read(text);
            System.out.println("읽은 문자 개수 = " + num);
            System.out.println(text);
            in.close();
        } catch(Exception e) {}
    }
}
