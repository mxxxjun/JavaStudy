package Object;

public class JavaTestClone {
    public static void main(String[] args){
        int[] ar = {1,2,3,4,5};
        int[] ar2 = ar.clone();

        ar2[0] = 1000;

        System.out.println("ar[0] : " + ar[0]);
        System.out.println("ar2[0] : " + ar2[0]);

        System.out.println();

        Human kim = new Human(29, "김상형");
        Human kim2 = (Human)kim.clone();

        kim2.name = "이순신";

        System.out.println("kim.name : " + kim.name);
        System.out.println("kim2.name : " + kim2.name);
    }
}
