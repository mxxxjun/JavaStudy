package Object;

public class JavaTestEquals {
    public static void main(String[] args){
        Human kim = new Human(29, "김상형");
        Human lee = new Human(43, "이승우");
        Human kimcopy = kim;
        Human kim2 = new Human(29, "김상형");

        System.out.println("kim == lee : " + (kim == lee ? "같다" : "다르다"));
        System.out.println("kim == kimcopy : " + (kim == kimcopy ? "같다" : "다르다"));
        System.out.println("kim == kim2 : " + (kim == kim2 ? "같다" : "다르다"));

        System.out.println();

        System.out.println("kim.equals(lee) : " + (kim.equals(lee) ? "같다" : "다르다"));
        System.out.println("kim.equals(kimcopy) : " + (kim.equals(kimcopy) ? "같다" : "다르다"));
        System.out.println("kim.equals(kim2) : " + (kim.equals(kim2) ? "같다" : "다르다"));

        System.out.println();

        String korea = "대한민국";
        String korea2 = new String("대한민국");

        System.out.println("== 비교 : " + (korea == korea2 ? "같다" : "다르다"));
        System.out.println("equals 비교 : " + (korea.equals(korea2) ? "같다" : "다르다"));
    }
}
