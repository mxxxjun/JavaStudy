public class Reference {
    public static void main(String args[]){
        int i =1;
        int i2 = i;

        i2 = 1000;
        System.out.println("i = " + i);
        System.out.println("i2 = " + i2);

        int[] ar = { 1,2,3 };
        int[] ar2 = ar;

        ar2[0] = 1000;
        System.out.println("ar[0] = " + ar[0]);
        System.out.println("ar2[0] = " + ar2[0]);

        i = 123;
        i2 = 123;
        int[] arr = { 1,2,3 };
        int[] arr2 = { 1,2,3 };
        int[] arr3 = arr;

        System.out.println("i와 i2 : " + ( i == i2 ? "같다" : "다르다"));
        System.out.println("arr과 arr2 : " + (arr == arr2 ? "같다" : "다르다"));
        System.out.println("arr과 arr3 : " + (arr == arr3 ? "같다" : "다르다"));
        System.out.println();
        int[] arr4 = {1,2,3};
        System.out.println(arr4[0]);
        arr4 = null;
        System.out.println(arr4[0]);

    }
}
