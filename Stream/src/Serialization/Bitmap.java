package Serialization;

import java.io.*;

public class Bitmap implements Serializable {
    byte[] raster;
    public Bitmap(int width){
        raster = new byte[width];
        int i;
        for(i=0; i<100; i++) raster[i] = 1;
        for(i=100; i<width/2; i++) raster[i] = 8;
        for(i=width/2; i<width; i++) raster[i] = 7;
    }

    @Serial
    private void writeObject(ObjectOutputStream out) throws IOException{
        out.writeInt(raster.length);
        int num = 1;
        byte value = raster[0];
        for(int i = 1; i < raster.length; i++){
            if(value == raster[i]) num++;
            else{
                out.writeByte(value);
                out.writeInt(num);
                num = 1;
                value = raster[i];
            }
        }
        if(num != 1){
            out.writeByte(value);
            out.writeInt(num);
        }
    }

    @Serial
    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException{
        int length = in.readInt();
        raster = new byte[length];
        int num;
        byte value;
        int offset;
        for(offset=0; offset < length;){
            value = in.readByte();
            num = in.readInt();
            for(int i = 0; i < num; i++){
                raster[offset] = value;
                offset++;
            }
        }
    }
}

class JavaTest2{
    public static void main(String[] args) throws Exception{
        Bitmap girl = new Bitmap(32000);

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("girl2.bitmap"));
        out.writeObject(girl);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("girl2.bitmap"));
        Bitmap girl2 = (Bitmap)in.readObject();
        in.close();
    }
}