package SupportStream;

import java.io.BufferedReader;
import java.io.FileReader;

public class readString {
    public static void main(String[] args){
        String str = ReadFileToString("애국가-Utf8nb.txt");
        System.out.println(str);
    }

    static String ReadFileToString(String path){
        StringBuffer Result = new StringBuffer();
        int ch;
        try{
            BufferedReader in = new BufferedReader(new FileReader(path));
            for(;;){
                ch = in.read();
                if(ch == -1) break;
                Result.append((char) ch);
            }
        } catch(Exception e) {}
        return Result.toString();
    }
}
