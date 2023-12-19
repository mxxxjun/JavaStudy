package Serialization;

import java.io.*;

public class serial {
    public static void main(String[] args) throws Exception{
        Car pride = new Car("프라이드", "파랑", true);

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("pride.car"));
        out.writeObject(pride);
        out.close();
        System.out.println("파일로 기록");

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("pride.car"));
        Car pride2 = (Car)in.readObject();
        in.close();
        pride2.outInfo();
    }
}

class Car implements Serializable{
    String name;
    String color;
    boolean gasoline;

    Car(String name, String color, boolean gasoline){
        this.name = name;
        this.color = color;
        this.gasoline = gasoline;
    }

    void outInfo(){
        System.out.printf("이름 = %s, 색상 = %s, 연료 = %s\n",name, color, gasoline);
    }
}