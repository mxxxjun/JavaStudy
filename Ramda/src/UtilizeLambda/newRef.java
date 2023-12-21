package UtilizeLambda;

import java.util.function.BiFunction;

class Human3{
    int age;
    String name;
    Human3(int age, String name){
        this.age = age;
        this.name = name;
    }
}

public class newRef {
    public static void main(String[] args){
        BiFunction<Integer, String, Human3> creator = Human3::new;
        Human3 kim = creator.apply(21, "노명준");
        System.out.println(kim.age + "세 " + kim.name);
    }
}
