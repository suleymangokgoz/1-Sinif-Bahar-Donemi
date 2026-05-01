// metotun olduğu class . metotun adı şeklinde yapabiliriz
// bir önceki classdaki (A10_ornek) metotu burada kullanacağım.

//class adıyla erişilebilen metotlar statictir.


package A01_metotlar;


public class A11_metotuFarkliClassIcındeKullanma {


    public static void main(String[] args) {
        
        int[] dizi = new int[10];
        A10_ornek.assignArray(dizi); // A10_ornek classının içindeki assignArray metotunu bu classa çağırdım.
        
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i]+" ");
        }
        
    }
    
}
