package SupportStream;

import java.io.FileReader;
import java.io.LineNumberReader;

public class readLine {
    public static void main(String[] args) throws Exception {
        LineNumberReader in = new LineNumberReader(new FileReader("애국가-Utf8nb.txt"));
        for(;;){
            String line = in.readLine();
            if(line == null) break;
            int num = in.getLineNumber();
            System.out.printf("%4d : %s\n", num, line);
        }
        in.close();
    }
}
