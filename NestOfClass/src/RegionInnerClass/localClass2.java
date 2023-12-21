package RegionInnerClass;

public class localClass2 {
    public static void main(String[] args){
        Human kim = new Human(29, "김상형");
        kim.intro();
    }
}

class Human{
    int age;
    String name;

    Human(int age, String name){
        this.age = age;
        this.name = name;
    }

    void intro(){
        final String nameCaption = "이름";
        final String ageCaption = "나이";

        class Formatter{
            void outInfo(){
                System.out.println(nameCaption + " : " + name);
                System.out.println(ageCaption + " : " + age);
            }
        }

        Formatter formatter = new Formatter();
        formatter.outInfo();
    }
}
