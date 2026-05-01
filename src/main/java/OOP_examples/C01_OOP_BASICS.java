/*

Nesne oluşturmak.
-------------------------------------------------------------------------------
-metotları ve eklemek istediğim değişkenleri C03_OOP_BASICS içine tanımlanacak.
 objeyi ise C04_OOP_MAIN içinde tanımlayacağız.
private: Sadece yazıldığı dosya (Class) görebilir. (En kilitli olan)
Hiçbir şey yazmamak (Default): Sadece aynı package içindeki dosyalar görebilir. (Yarı kilitli)
public: Projedeki her yer görebilir. (Tamamen açık)

Görev 1: Özellikleri (Değişkenleri) Belirle
Bana bu banka hesabının özelliklerini tanımlayacaksın.
Ama hocanın "Encapsulation" (Sarmalama) kuralına uyarak!
Yani dışarıdan kimse bu değişkenlere kafasına göre ulaşamasın diye
başlarına private kelimesini koyacaksın.

Görev 2: Constructor (Yapıcı Metot) Yaz
Diğer dosyada (Main'de) new kelimesiyle yeni bir hesap oluşturduğumuz ilk anda,
o hesabın sahibinin adını ve başlangıç parasını belirlememiz lazım.
İşte bunu Constructor ile yapacağız.

*/
package OOP_examples;


public class C01_OOP_BASICS {
    
    private String hesapSahibi;
    private double bakiye;
    
    public C01_OOP_BASICS(String hesapSahibi , double bakiye){ //Eğer ismini farklı yapsaydın, Java onu "Constructor" olarak değil, "hatalı yazılmış normal bir metot" olarak görürdü ve nesne oluştururken o içindeki atama işlemlerini yapmazdı.
        this.bakiye = bakiye;  //this.bakiye = bakiye; yazdığında Java'ya şu net emri verirsin: "Parantezden gelen değeri al, sınıfın asıl değişkenine ata." Tek amacı bu isim benzerliğindeki karmaşayı çözmektir.
        this.hesapSahibi = hesapSahibi;
    }
    
    public double getBakiye(){
        return bakiye;
    }
    
    public String getHesapSahibi(){
        return hesapSahibi;
    }
    
    public void paraCek(double miktar){
        if(bakiye >= miktar){
            bakiye -= miktar;
            System.out.println("Para cekildi!");
        }else{
            System.out.println("Yetersiz Bakiye!");
        }
    }
    
    public void paraYatir(double miktar){
        bakiye += miktar;
        System.out.println("Para Yatirildi!");
    }
    
}
