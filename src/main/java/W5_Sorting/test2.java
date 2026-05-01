package W5_Sorting;


import java.util.*;

public class test2 {

    public static int bsearch_recursive(int[] array, int left, int right, int target){
        if(left > right){
            return -1;
        }

        int mid = (left + right) / 2;

        if(array[mid] == target){
            return mid;
        }

        if(array[mid] > target){
            return bsearch_recursive(array, left, mid - 1, target);
        }

        return bsearch_recursive(array, mid + 1, right, target);
    }

    public static int binarysearch(int[] array, int target){
        int left = 0;
        int right = array.length - 1;

        while(left <= right){
            int mid = (left + right) / 2;

            if(array[mid] == target)
                return mid;

            if(array[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return -1;
    }

    public static int[] generatearray(int N){
        Random r = new Random();
        int[] array = new int[N];

        for(int i = 0; i < array.length; i++){
            array[i] = r.nextInt(2000);
        }

        Arrays.sort(array);
        return array;
    }

    public static void main(String[] args){

        int[] x = generatearray(100000);
        int target = 1200;

        int runs = 1000000;

        // JVM warm-up
        for(int i = 0; i < 10000; i++){
            binarysearch(x, target);
            bsearch_recursive(x, 0, x.length - 1, target);
        }

        // Iterative timing
        long start1 = System.nanoTime();
        for(int i = 0; i < runs; i++){
            binarysearch(x, target);
        }
        long end1 = System.nanoTime();

        // Recursive timing
        long start2 = System.nanoTime();
        for(int i = 0; i < runs; i++){
            bsearch_recursive(x, 0, x.length - 1, target);
        }
        long end2 = System.nanoTime();

        System.out.println("Iterative avg time: " + (end1 - start1)/runs + " ns");
        System.out.println("Recursive avg time: " + (end2 - start2)/runs + " ns");
    }
}
