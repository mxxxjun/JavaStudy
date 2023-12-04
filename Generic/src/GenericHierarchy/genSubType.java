package GenericHierarchy;

import java.util.ArrayList;

class Human2{}
class Student2 extends Human2{}

public class genSubType {
    public static void main(String[] args){
        ArrayList<Human2> ah = new ArrayList<Human2>();
        ArrayList<Student2> as = new ArrayList<>();

        ah.add(new Human2());
        as.add(new Student2());
        ah.add(new Student2());

        //ah = as;
        ah.add(new Human2());
        Student2 k = as.get(0);
    }
}
