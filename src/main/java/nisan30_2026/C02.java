// ! ! ! RECURSIVE CALIS ! ! ! \\
// recursive ve metot 1 soru finalde gelecekmiş
// Spring boot (backend)

package nisan30_2026;

public class C02 {
    
    public static int diziTopla(int[] dizi, int index) {
        if (index == dizi.length) {
            return 0;
        }
        return dizi[index] + diziTopla(dizi, index + 1);
    }
    
    
    
    
    
   // public static int diziMaxRec(int[] dizi , int index){
   //     if(dizi[index])
    //}
    
    public static void main(String[] args) {
        
        int[] a = {1,2,3,4,5,6,7,8,9,12,45};
        
        int[] sayilar = {1, 7, 5, 9, 12, 8};
        int sonuc = diziTopla(sayilar,0);
        System.out.println("Toplam : " + sonuc);
    }
    
}