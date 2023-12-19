package NestingClass;

class Human3{
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

    Human3(int age, String first, String family){
        this.age = age;
        this.name = new Name2(first,family);
    }

    void intro(){
        System.out.println("안녕, " + age + "살 " + name.family + name.first + "입니다.");
    }
}
public class newInner {
    public static void main(String[] args){
        Human3 kim = new Human3(29, "상형", "김");
        kim.intro();

        Human3.Name2 name = kim.new Name2("순신", "이");
        System.out.print(name.family + name.first + ":");
        name.outAge();
    }
}
