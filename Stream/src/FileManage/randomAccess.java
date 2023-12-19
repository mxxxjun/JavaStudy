package FileManage;

import java.io.IOException;
import java.io.RandomAccessFile;

public class randomAccess {
    public static void main(String[] args) throws IOException {
        byte[] data = {1,2,3,4,5,6,7,8,9,10,11,12};
        RandomAccessFile file = new RandomAccessFile("random.dat", "rw");
        file.write(data);
        System.out.println("Write success");

        file.seek(0);
        for(;;){
            int value = file.read();
            if(value == -1) break;
            System.out.print(value);
        }

        file.close();
    }
}
