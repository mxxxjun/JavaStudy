package UtilizeLambda;

import java.util.function.Predicate;

class Human2{
    int age;
    String name;
    Human2(int age, String name){
        this.age = age;
        this.name = name;
    }
}

public class predicate2 {
    static Human2[] members = {
            new Human2(21, "김상형"),
            new Human2(14, "김한슬"),
            new Human2(21, "문한울"),
            new Human2(66, "구홍녀")
    };

    public static void main(String[] args){
        listHuman("김가", h -> h.name.startsWith("김"));
        listHuman("미성년 김가", h -> h.name.startsWith("김") && h.age < 19);
    }

    static void listHuman(String cap, Predicate<Human2> pred){
        System.out.print(cap + "인 사람 목록 : ");
        for(Human2 h : members){
            if(pred.test(h)){
                System.out.print(h.name + " ");
            }
        }
        System.out.println();
    }
}
