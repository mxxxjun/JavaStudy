package SupportStream;

import java.io.IOException;

public class conin {
    public static void main(String[] arg){
        int name;
        System.out.println("이름을 입력한 후 Enter를 누르시오(끝낼 때는 Ctrl + Z).");
        for(;;){
            try{
                name = System.in.read();
                if(name == -1) break;
                System.out.print((char) name);
            } catch (IOException e) {}
        }
        System.out.println("입력 완료");
    }
}
