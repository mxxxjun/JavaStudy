package InterfaceExtension;

public interface Camera {
    default void takepicture(){
        System.out.println("찰칵. 사진을 찍는다.");
    }
}
