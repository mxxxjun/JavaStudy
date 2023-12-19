package Serialization;

import java.io.*;

public class transientTest {
    public static void main(String[] args) throws Exception{
        Car2 pride = new Car2("프라이드", "파랑", true);
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("pride.car"));
        out.writeObject(pride);
        out.close();
        System.out.println("파일로 기록");

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("pride.car"));
        Car2 pride2 = (Car2)in.readObject();
        in.close();
        pride2.outInfo();
    }
}

class Car2 implements Serializable {
    String name;
    String color;
    transient boolean gasoline;
    static int count;

    Car2(String name, String color, boolean gasoline){
        this.name = name;
        this.color = color;
        this.gasoline = gasoline;
        count++;
    }

    void outInfo(){
        System.out.printf("이름 = %s, 색상 = %s, 연료 = %s\n",name, color, gasoline? "휘발유" : "경유");
    }
}