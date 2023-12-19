package NestingClass;

class Name{
    String first;
    String family;
    Name(String first, String family){
        this.first = first;
        this.family = family;
    }
}

class Human{
    int age;
    Name name;

    Human(int age, String first, String family){
        this.age = age;
        this.name = new Name(first, family);
    }

    void intro(){
        System.out.println("안녕, " + age + "살 " + name.family + name.first + "입니다.");
    }
}

public class innerClass {
    public static void main(String[] args){
        Human kim = new Human(29, "상형", "김");
        kim.intro();
    }
}
