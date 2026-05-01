// Bubble Sort :
// - Dizinin elemanlarını ikili şekilde en baştan başlayarak kontrol eder ve büyük olabı sağa atar(swap).
// - Aynı işlemi dizi sıralanana kadar yapar.

package W5_Sorting;

public class C01_bubleSort {
    
    public static void buble(int[] dizi){
        int n = dizi.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1-i; j++) {
                if(dizi[j]>dizi[j+1]){
                    int temp = dizi[j];
                    dizi[j] = dizi[j+1];
                    dizi[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        
        int[] dizi = {7,25,3,12,45,1,9}; 
        
    }
    
}
