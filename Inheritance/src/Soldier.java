public class Soldier extends Human{
    int milnum;

    Soldier(int age, String name, int milnum){
        super(age, name);
        this.milnum = milnum;
    }

    void fight(){
        System.out.println("따콩 따콩. 앞으로 전진!!");
    }
}
