package SupportStream;

import java.io.IOException;
import java.io.InputStreamReader;

public class conin2 {
    public static void main(String[] args){
        int name;
        System.out.println("이름을 입력한 후 Enter를 누르시오(끝낼 때는 Cmd + Z)");
        InputStreamReader r = new InputStreamReader(System.in);
        for(;;){
            try{
                name = r.read();
                if(name == -1) break;
                System.out.print((char) name);
            } catch (IOException e) {}
        }
        System.out.println("입력완료");
    }
}
