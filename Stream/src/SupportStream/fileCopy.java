package SupportStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileCopy {
    public static void main(String[] args){
        long start = System.currentTimeMillis();
        System.out.println("복사 시작");
        int data;
        try{
            FileInputStream src = new FileInputStream("src.pdf");
            FileOutputStream dest = new FileOutputStream("dest.pdf");
            for(;;){
                data = src.read();
                if(data == -1) break;
                dest.write(data);
            }
            src.close();
            dest.close();
            System.out.println("복사 완료");
            System.out.println((System.currentTimeMillis()-start)/1000.0 + "초 걸림");
        } catch (IOException e) {}
    }
}
