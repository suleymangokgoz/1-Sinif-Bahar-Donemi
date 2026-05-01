/*
+ iki boyutlu dizileri yazdırma işlemi
+ iki boyutlu dizileri m*n boyutunda rastgele sayılardan oluşturup döndüreceksinizi
+ iki boyutlu dizileri topla
+ iki boyutlu dizideki her satırdaki en küçük elemanları yazdıracaksınız
+ iki boyutlu dizideki her sütundaki en küçük elemanları yazdır
+ iki boyutlu dizideki her satırdaki en lüçük elemanların indislerini bir diziye atıp o diziyi döndür
+ iki boyutlu dizideki her sütundaki en küçük elemanların indislerini bir diziye aktarıp döndür
+ iki boyutlu dizideki her satırın ortalamasını bul ve döndür
+ iki boyutlu dizideki her sütundaki elemanların ortalamasını bulup döndür. (birden fazla eleman var diziyi aktarıp döndür)
 */

package A02_metotlar_kendi_orneklerim;

import java.util.Random;
import java.util.Scanner;

public class bunuYap {
    
    public static int[][] assignRandomValues(int[][] dizi){
        Random rnd = new Random();
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                dizi[i][j] = rnd.nextInt(100);
            }
        }
        return dizi;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();
        
        System.out.println("Satir sayisi giriniz : ");
        int satir = scan.nextInt();
        System.out.println("Sutun sayisi giriniz : ");
        int sutun = scan.nextInt();
        
        int[][] dizi1 = new int[satir][sutun];
        int[][] dizi2 = new int[satir][sutun];
        assignRandomValues(dizi1);
        assignRandomValues(dizi2);
        
        
    }
    
}
