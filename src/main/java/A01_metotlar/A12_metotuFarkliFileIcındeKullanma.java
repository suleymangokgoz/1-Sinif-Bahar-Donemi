// metotun olduğu class . metotun adı şeklinde yapabiliriz
// A02_metotlar_kendi_orneklerim file içinden bir metotu burada kullanacağım.

package A01_metotlar;

import java.util.Scanner;

public class A12_metotuFarkliFileIcındeKullanma {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("isminizi giriniz : ");
        String isim = input.nextLine();
        A02_metotlar_kendi_orneklerim.C01_hosgeldinMesaji.hosgeldinMesaji(isim);
        
    }
    
}
