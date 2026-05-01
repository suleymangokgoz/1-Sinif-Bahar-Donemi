// binarysearchde dizi sıralı olmalı yoksa çalışmaz.

package mart12_2026;


public class A01 {
    
    public static int bsearch_recursive(int[] array, int left, int right, int target){
        if(left>right){
            return -1;
        }
        int mid = (left +right)/2;
        if(array[mid]==target){
            return mid;
        }
        if(array[mid]>target){
            return bsearch_recursive(array,left,mid-1,target);
        }
        
        return bsearch_recursive(array,mid+1,right,target);
    }
    //else array[mid]<target
    public static void main(String[] args) {
        
    }
    
}
