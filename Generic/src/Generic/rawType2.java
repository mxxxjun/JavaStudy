package Generic;

class Box3<T>{
    T value;

    public Box3(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

public class rawType2 {
    public static void main(String[] args){
        Box3 raw = new Box3(1234);
        Box3<Integer> para = new Box3<>(5678);
        raw = para;
        int value = (int)raw.getValue();
        System.out.println(value);
    }
}
