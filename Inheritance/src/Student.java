public class Student extends Human{
    int stnum;
    String major;

    Student(int age, String name, int stnum, String major){
        super(age, name);
        this.stnum = stnum;
        this.major = major;
    }
    Student(float birth, String name, int stnum, String major){
        super(birth, name);
        this.stnum = stnum;
        this.major = major;
    }

    void study(){
        System.out.println("하늘천 따지 검을현 누를황");
    }
}
