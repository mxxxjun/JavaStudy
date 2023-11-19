package Interface;

public class SmartPhone extends HandPhone implements Camera, Mp3{
    @Override
    public void takepickture() {
        System.out.println("찰칵. 사진을 찍는다.");
    }

    @Override
    public void play() {
        System.out.println("띵가 띵가. 음악 재생");
    }
}
