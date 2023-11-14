public class Thief extends Human{
    String item;
    int star;

    Thief(int age, String name, String item, int star){
        super(age, name);
        this.item = item;
        this.star = star;
    }

    void steal(){
        System.out.println("살금살금~~ 후다닥~~");
    }

    @Override
    void intro() {
        super.intro();
        System.out.println(item + " 전문 털이범 전과" + star + "범입니다.");
    }
}
