package NestingClass;

class Human2{
    int age;
    Name2 name;

    class Name2{
        String first;
        String family;

        Name2(String first, String family){
            this.first = first;
            this.family = family;
        }

        void outAge(){
            System.out.println("저는 " + age + "살입니다.");
        }
    }

    Human2(int age, String first, String family){
        this.age = age;
        this.name = new Name2(first,family);
    }

    void intro(){
        System.out.println("안녕, " + age + "살 " + name.family + name.first + "입니다.");
    }
}

public class innerClass2 {
    public static void main(String[] args){
        Human2 kim = new Human2(29, "상형", "김");
        kim.intro();
        kim.name.outAge();
    }
}
