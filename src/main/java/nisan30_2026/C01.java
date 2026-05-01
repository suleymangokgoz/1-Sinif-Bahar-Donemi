package nisan30_2026;

public class C01 {
    
    public static int topla(int n){
        if(n==0){
            return 0;
        }
        return n + topla(n-1);
    }
    
    public static int diziTopla(int[] dizi){
        int toplam = 0;
        for (int i = 0; i < dizi.length; i++) {
            toplam += dizi[i];
        }
        return toplam;
    }
    
    
    
    public static void main(String[] args) {
        System.out.println(topla(5));
        
        int[] a = {1,5,7,3};
        diziTopla(a);
        
        
    }
    
}