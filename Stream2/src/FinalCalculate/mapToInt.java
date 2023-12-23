package FinalCalculate;

public class mapToInt {
    public static void main(String[] args){
        int total = Data.nara.stream()
                .mapToInt(country::getPopu)
                .sum();
        System.out.println(total);
    }
}
