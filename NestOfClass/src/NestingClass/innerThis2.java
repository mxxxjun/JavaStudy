package NestingClass;

class Human5{
    int age = 30;
    Name name = new Name();
    class Name{
        int age = 50;
        void intro(){
            System.out.println(age);
            System.out.println(this.age);
            System.out.println(Human5.this.age);
        }
    }
}

public class innerThis2 {
    public static void main(String[] args){
        Human5 park = new Human5();
        park.name.intro();
    }
}
