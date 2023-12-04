package Generic;

public class intBox {
    int value;
    intBox(int value){this.value = value;}
    int get() {return value;}
    void set(int value) {this.value = value;}
}

class doubleBox{
    double value;
    doubleBox(double value){this.value = value;}
    double get(){
        return value;
    }
    void set(double value){
        this.value = value;
    }
}
class JavaTest{
    public static void main(String[] args){
        intBox bi = new intBox(1234);
        int biv = bi.get();
        System.out.println(biv);

        doubleBox bd = new doubleBox(56.78);
        double bdv = bd.get();
        System.out.println(bdv);
    }
}