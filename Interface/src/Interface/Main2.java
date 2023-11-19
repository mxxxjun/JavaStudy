package Interface;

public class Main2 {
    public static void main(String[] args){
        DarkTempler dt = new DarkTempler();
        dt.hide();

        Medic medic = new Medic();
        medic.heal();

        System.out.println();

        HandPhoneCamera myphone = new HandPhoneCamera();
        myphone.call();
        myphone.takepickture();

        HandPhoneCamera2 myPhone = new HandPhoneCamera2();
        myPhone.call();
        myPhone.camera2.takepicture();

        System.out.println();
        SmartPhone galaxy = new SmartPhone();
        galaxy.call();
        galaxy.takepickture();
        galaxy.play();
    }
}
