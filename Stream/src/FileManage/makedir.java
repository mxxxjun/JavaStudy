package FileManage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class makedir {
    public static void main(String[] args) throws IOException {
        File folder = new File("TestFolder");
        if(folder.mkdir()){
            File file = new File("TestFolder/MyFile.txt");
            if(file.createNewFile()){
                FileWriter out = new FileWriter(file);
                out.write("테스트 파일");
                out.close();
            }
        }
    }
}
