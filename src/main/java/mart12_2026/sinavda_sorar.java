// insert veya bubble sort çiz veya kod olabilir. hangisi olacağı belirsiz.
// bütün sorularda metot var
// bir tane soruda metot yazmamızı isteyecek.
// eksik kod vericek metodu biz yazıcaz(kodda sadece metot ismi yazacak mesela)
// bir tane recursive

package mart12_2026;

public class sinavda_sorar {
    
    public static void bubblesort(int[] array){
        for (int i = 0; i < array.length-1; i++) { //her itarasyon için
            for (int j = 0; j < array.length-i-1; j++) { //soldan sağa swap işlemi
                if(array[j]>array[j+1]){
                    int temp = array[j]; //j. elemanın değerini tutmak için ara değişkendir.
                    array[j] = array[j+1];// j+1. eleman j. elemana atanır.
                    array[j+1] = temp;//temp yani j. elemanda j+1. değişkene atanır.
                }
                
            }
        }
        
    }
    
    public static void arrayprint(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }


    public static void main(String[] args) {
        int[] array = {8,5,7,3,2};
        bubblesort(array);
        arrayprint(array);
        
        
    }
   
}

// 87654 45687 hangisi daha uzun sürer sıralaması?
// sortları sor ve farklarını öğren. (bubble, insertion, quick, selection,merge)