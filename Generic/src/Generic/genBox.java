package Generic;

class Box<T>{
    T value;
    Box(T value){
        this.value = value;
    }
    T get(){
        return value;
    }
    void set(T value){
        this.value = value;
    }
}

public class genBox {
    public static void main(String[] args){
        Box<Integer> bi = new Box<>(1234);
        int biv = bi.get();
        System.out.println(biv);

        Box<Double> bd = new Box<>(56.78);
        double bdv = bd.get();
        System.out.println(bdv);
        System.out.println(bi.getClass() == bd.getClass());
    }
}
