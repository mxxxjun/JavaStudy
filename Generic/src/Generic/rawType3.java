package Generic;

class Box4<T>{
    T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Box4(T value) {
        this.value = value;
    }
}

public class rawType3 {
    public static void main(String[] args){
        Box4 raw = new Box4("노명준");
        Box4<Integer> para = new Box4<>(5678);
        para = raw;
        int value = para.getValue();
        System.out.println(value);
    }
}
