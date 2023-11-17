public class Main {
    public static void main(String[] args) {
        Marine marine = new Marine();
        marine.move();
        marine.attack();
        Zealot zealot = new Zealot();
        zealot.move();
        zealot.attack();

        //부모 객체 배열 선언 및 내부에는 자식 객체 저장
        Unit[] arUnit = {
                new Marine(),
                new Zealot(),
                new Mutal()
        };

        for(Unit u : arUnit){
            u.move();
            u.attack();
        }

        Language lang_java = new Java();
        outLanguageName(lang_java);
    }

    public static void outLanguageName(Language lang){
        if(lang instanceof  Java) System.out.println("자바");
        else if(lang instanceof Cpp) System.out.println("C++");
        else if(lang instanceof CSharp) System.out.println("C#");
    }
}