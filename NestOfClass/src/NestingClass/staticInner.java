package NestingClass;

class Human6{
    int age;
    Name name;

    static class Name{
        String first;
        String family;
        Name(String first, String family){
            this.first = first;
            this.family = family;
        }
    }

    Human6(int age, String first, String family){
        this.age = age;
        this.name = new Name(first,family);
    }

    void intro(){
        System.out.println("안녕, " + age + "살 " + name.family + name.first + "입니다.");
    }
}

public class staticInner {
    public static void main(String[] args){
        Human6 kim = new Human6(29, "상형", "김");
        kim.intro();

        Human6.Name name = new Human6.Name("순신", "이");
        System.out.println("이름 : " + name.family + name.first);
    }
}
