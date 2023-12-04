package Generic;

class Box2<T>{
    T value;
    Box2(T value){
        this.value = value;
    }
    T get(){
        return value;
    }
    void set(T value){
        this.value = value;
    }
}
public class rawType {
    public static void main(String[] args){
        Box2 rb = new Box2<>(1234);
        int rbv = (int)rb.get();
        String a = (String)rb.get();
        System.out.println(rbv);
    }
}
