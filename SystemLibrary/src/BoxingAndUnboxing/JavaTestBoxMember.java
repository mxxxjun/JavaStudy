package BoxingAndUnboxing;

public class JavaTestBoxMember {
    public static void main(String[] args){
        System.out.printf("int 타입의 크기 = %d, 최솟값 = %d, 최댓값 = %d\n",
                Integer.SIZE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("short 타입의 크기 = %d, 최솟값 = %d, 최댓값 = %d\n",
                Short.SIZE, Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf("long 타입의 크기 = %d, 최솟값 = %d, 최댓값 = %d\n",
                Long.SIZE, Long.MIN_VALUE, Long.MAX_VALUE);

        System.out.println();

        System.out.println(Integer.toBinaryString(1234));
        System.out.println(Integer.toBinaryString(Float.floatToRawIntBits(0.1f)));

        System.out.println();

        System.out.printf("Float의 크기 = %d, 지수 최솟값 = %d, 지수 최댓값 = %d\n",
                Float.SIZE, Float.MIN_EXPONENT, Float.MAX_EXPONENT);
        System.out.printf("Double의 크기 = %d, 지수 최솟값 = %d, 지수 최댓값 = %d\n",
                Double.SIZE, Double.MIN_EXPONENT, Double.MAX_EXPONENT);
    }
}
