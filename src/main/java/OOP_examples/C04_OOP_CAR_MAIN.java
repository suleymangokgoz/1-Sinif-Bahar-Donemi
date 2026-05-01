
package OOP_examples;


public class C04_OOP_CAR_MAIN {

    public static void main(String[] args) {
        
        C03_OOP_CAR araba1 = new C03_OOP_CAR("BMW", "M5", "Siyah", 2024, 300);
        System.out.println("Araba 1 uretildi. Toplam sayı: " + C03_OOP_CAR.toplamArabaSayisi);
        C03_OOP_CAR araba2 = new C03_OOP_CAR("Audi", "RS6", "Gri", 2023, 280);
        System.out.println("Araba 2 uretildi. Toplam sayı: " + C03_OOP_CAR.toplamArabaSayisi);
        C03_OOP_CAR araba3 = new C03_OOP_CAR("Renoult", "Toros", "Mavi", 1986, 180);
        System.out.println("Araba 3 uretildi. Toplam sayı: " + C03_OOP_CAR.toplamArabaSayisi);
        
        
        /*
        Bak, yukarıdaki println kodunda araba1.toplamArabaSayisi yazmadım.
        C05_OOP_ARABA.toplamArabaSayisi yazdım.
        Çünkü static değişkenler nesneye (araba1'e) değil, sınıfa (C05_OOP_ARABA) aittir.
        Javada statik bir şeye ulaşacaksan sınıfın ismini kullanırsın.
        */
        
        araba2.bilgiAl();
        araba3.bilgiAl();
        
        araba1.bilgiAl();
        araba1.hizlan(100);
        araba1.bilgiAl();
        
        
    }
    
}
