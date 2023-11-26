package System;

import java.util.Arrays;

public class CopyOf {
    public static void main(String[] args){
        int[] ar = {1,2,3,4,5};
        int[] ar2 = Arrays.copyOf(ar, ar.length);
        for(int a : ar2) System.out.print(a + " ");
        System.out.println();

        int[] ar3 = Arrays.copyOfRange(ar, 1, 3);
        for(int a : ar3) System.out.print(a + " ");
    }
}
