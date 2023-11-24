package Object;

public class Human {
    int age;
    String name;

    Human(int age, String name){
        this.age = age;
        this.name = name;
    }

    public String toString(){
        return age + "세의 " + name;
    }

    void intro(){
        System.out.println("안녕, " + age + "살 " + name + "입니다.");
    }

    public boolean equals(Object obj){
        if(obj instanceof Human){
            Human other = (Human)obj;
            return (age == other.age && name.equals(other.name));
        } else{
            return false;
        }
    }
}
