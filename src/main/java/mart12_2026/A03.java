package mart12_2026;

import java.util.Random;

public class A03 {
    
    public static int[] generatearray(int N){
        Random rnd = new Random();
        int[] array = new int[N];
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(2000);
        }
       // Arrays.sort(array); //sıralama işlemi (bende bu fonk olmadıgı için çalışmayacak.)
        return array;
    }

    public static void main(String[] args) {
        
        //yedinci örnek
        // int[] x1 = generatearray(1000);
       // int[] result1 = binarysearch(x,1200);
       // int[] int result2 = bsearch_recursive(x,0,x.length,1200); //recursive
    }
    
}