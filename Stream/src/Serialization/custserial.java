package Serialization;

import java.io.*;

public class custserial implements Serializable {
    byte[] raster;
    public custserial(int width){
        raster = new byte[width];
        int i;
        for(i=0; i<100; i++) raster[i] = 1;
        for(i=100; i<width/2; i++) raster[i] = 8;
        for(i=width/2; i<width; i++) raster[i] = 7;
    }
}

class JavaTest{
    public static void main(String[] args) throws Exception{
        custserial girl = new custserial(32000);

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("girl.bitmap"));
        out.writeObject(girl);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("girl.bitmap"));
        custserial girl2 = (custserial) in.readObject();
        in.close();
    }
}