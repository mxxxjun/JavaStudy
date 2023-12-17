package SupportStream;

import java.io.*;

public class dataIo {
    public static void main(String[] args){
        try{
            DataOutputStream out = new DataOutputStream(new FileOutputStream("test.dat"));
            out.writeInt(1234);
            out.writeDouble(3.14159265);
            out.writeUTF("String 문자열");
            System.out.println("Write SUCCESS");

            DataInputStream in = new DataInputStream(new FileInputStream("test.dat"));
            int i = in.readInt();
            double d = in.readDouble();
            String str = in.readUTF();
            System.out.printf("i = %d, d = %f, str = %s",i,d,str);
        } catch (IOException e) {}
    }
}
