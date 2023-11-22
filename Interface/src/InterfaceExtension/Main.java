package InterfaceExtension;

public class Main {
    public static void main(String[] args){
        new Marine().die();
        new Zealot().die();

        System.out.println();

        Unit2 m = new Marine2();
        Unit2.moveAttack(m);

        System.out.println();

        HandPhoneCamera myPhone = new HandPhoneCamera();
        myPhone.call();
        myPhone.takepicture();

        System.out.println();

        C c = new C();
        c.print();
    }
}
