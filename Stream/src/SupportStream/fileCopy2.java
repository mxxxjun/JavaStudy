package SupportStream;

import java.io.*;

public class fileCopy2 {
    public static void main(String[] args){
        long start = System.currentTimeMillis();
        System.out.println("복사 시작");
        int data;
        try{
            BufferedInputStream src = new BufferedInputStream(new FileInputStream("src.pdf"));
            BufferedOutputStream dest = new BufferedOutputStream(new FileOutputStream("des.pdf"));
            for(;;){
                data = src.read();
                if(data == -1) break;
                dest.write(data);
            }
            src.close();
            dest.close();
        } catch (IOException e) {}
        System.out.println("복사 완료");
        System.out.println((System.currentTimeMillis() - start)/1000.0 + "초 걸림");
    }
}
