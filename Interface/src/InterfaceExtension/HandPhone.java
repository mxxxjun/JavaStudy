package InterfaceExtension;

public interface HandPhone {
    default void call(){
        System.out.println("전화를 건다.");
    }
    default void receive(){
        System.out.println("전화를 받는다.");
    }
}
