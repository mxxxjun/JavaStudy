package FinalCalculate;

public class reduce {
    public static void main(String[] args){
        int total = Data.nara.stream()
                .map(country::getPopu)
                .reduce(0, Integer::sum);
        System.out.println(total);
    }
}
