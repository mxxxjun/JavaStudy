package HashMap;

import java.util.HashMap;

class Human2{
    int age;
    String name;

    Human2(int age, String name){
        this.age = age;
        this.name = name;
    }

    public int hashCode(){
        return name.length() + age;
    }

    public boolean equals(Object obj){
        if(obj instanceof Human2){
            Human2 other = (Human2) obj;
            return (age == other.age && name == other.name);
        } else{
            return false;
        }
    }
}

public class hashCode2 {
    public static void main(String[] args){
        HashMap<Human2, Integer> donate = new HashMap<>();
        donate.put(new Human2(42, "김기남"), 10000);
        donate.put(new Human2(24, "박수빈"), 20000);
        donate.put(new Human2(20, "박수현"), 5000);
        donate.put(new Human2(11, "최상미"), 8000);

        Human2 park = new Human2(20, "박수현");
        System.out.println(park.name + "씨의 기부금 = " + donate.get(park));
    }

}
