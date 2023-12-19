package NestingClass;

class Human4{
    int age;
    Name name;

    class Name{
        String first;
        String family;
        Name(String first, String family){
            this.first = first;
            this.family = family;
        }

        void outName(){
            Util.outName(this);
        }

        void outWho(){
            Util.outHuman(Human4.this);
        }

        void intro(){
            System.out.println("안녕, " + age + "살 " + name.family + name.first + "입니다.");
        }
    }

    Human4(int age, String first, String family){
        this.age = age;
        this.name = new Name(first, family);
    }

    void intro(){
        System.out.println("안녕, " + age + "살 " + name.family + name.first + "입니다.");
    }
}

class Util{
    static void outName(Human4.Name name){
        System.out.println(name.family + name.first + "입니다.");
    }

    static void outHuman(Human4 who){
        who.intro();
    }
}

public class innerThis {
    public static void main(String[] args){
        Human4 kim = new Human4(29, "상형", "김");
        kim.name.outName();
        kim.name.outWho();
    }
}
