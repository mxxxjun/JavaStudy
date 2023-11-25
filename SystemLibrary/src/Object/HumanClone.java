package Object;

public class HumanClone implements Cloneable{
    int age;
    String name;
    int[] score = new int[]{1,2,3};

    HumanClone(int age, String name){
        this.age = age;
        this.name = name;
    }

    public Object clone(){
        try{
            HumanClone other = (HumanClone)super.clone();
            other.score = this.score.clone();
            return other;
        }
        catch(CloneNotSupportedException e){
            return null;
        }
    }
}

class JavaTest{
    public static void main(String[] args){
        HumanClone kim = new HumanClone(29, "김상형");
        HumanClone kim2 = (HumanClone) kim.clone();

        kim2.score[0] = 999;

        System.out.println("kim.name : " + kim.name);
        System.out.println("kim2.name : " + kim2.name);

        System.out.println();

        System.out.println("kim.score[0] : " + kim.score[0]);
        System.out.println("kim2.score[0] : " + kim2.score[0]);
    }
}