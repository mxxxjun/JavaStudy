package FileManage;

import java.io.IOException;
import java.io.RandomAccessFile;

public class randomAccess2 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile file = new RandomAccessFile("random.dat", "r");

        file.seek(4);
        byte value1 = file.readByte();
        System.out.print(value1);
        byte value2 = file.readByte();
        System.out.print(value2);
        file.close();
    }
}
