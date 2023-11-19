package Abstract;

public class Main{
    public static void main(String[] args) {
        Marine marine = new Marine();
        marine.move();
        marine.attack();

        Zealot zealot = new Zealot();
        zealot.move();
        zealot.attack();

        System.out.println();

        Unit[] arUnit = {
                new Marine(),
                new Zealot(),
                new Mutal()
        };

        for(Unit u : arUnit){
            u.move();
            u.attack();
        }

        System.out.println();

        Language lang_java = new Java();
        outLanguageName(lang_java);
    }

    public static void outLanguageName(Language language){
        if(language instanceof Java) System.out.println("자바");
        if(language instanceof Cpp) System.out.println("C++");
        if(language instanceof CSharp) System.out.println("C#");
    }
}