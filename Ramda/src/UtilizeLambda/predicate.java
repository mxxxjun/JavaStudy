package UtilizeLambda;

import java.util.function.Predicate;

class Human{
    int age;
    String name;
    Human(int age, String name){
        this.age = age;
        this.name = name;
    }
}

public class predicate {
    public static void main(String[] args){
        Human kim = new Human(21, "김상형");
        Predicate<Human> isAdult = h -> h.age >= 19;
        System.out.println(isAdult.test(kim));
    }
}
