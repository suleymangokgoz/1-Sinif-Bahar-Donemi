// Insertion Sort :
// - Soldan sağa doğru elemanları tek tek alıp solda kalan tarafta doğru konuma getirmektir.

package W5_Sorting;

public class C02_insertionSort {
    
    public static void insertion(int[] dizi){
        int n = dizi.length;
        for (int i = 1; i < n; i++) {
            int key = dizi[i];
            int j = i-1;
            while(j>=0 && dizi[j]>key){
                dizi[j+1] = dizi[j];
                j = j-1;
            }
            dizi[j+1] = key;
        }
    }

    public static void main(String[] args) {
        
        int[] dizi = {7,25,3,12,45,1,9};
        
    }
    
}
