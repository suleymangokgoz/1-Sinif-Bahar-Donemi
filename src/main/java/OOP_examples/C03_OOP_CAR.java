package OOP_examples;

public class C03_OOP_CAR {

    private int uretimYili, hiz;
    private String marka, model, renk;
    public static int toplamArabaSayisi = 0; //Ortak hafıza kutusu

    public C03_OOP_CAR(String marka, String model, String renk, int uretimYili, int hiz) {
        this.marka = marka;
        this.model = model;
        this.renk = renk;
        this.uretimYili = uretimYili;
        this.hiz = hiz;
        toplamArabaSayisi++; //Her yeni araba (new) üretildiğinde ortak kutuyu 1 artırır
    }

    public static void toplamSayiyiYazdir() {
        System.out.println("Şu ana kadar üretilen toplam araba: " + toplamArabaSayisi);
    }

    public void hizlan(int miktar) {
        if (miktar > 0) {
            hiz += miktar;
        }
    }

    public void fren(int miktar) {
        if (hiz >= miktar) {
            hiz -= miktar;
        } else {
            hiz = 0; // Eğer miktar hızdan fazlaysa arabayı tamamen durdur (eksiye düşmesin)
        }
    }

    public void bilgiAl() {
        System.out.println("Arac marka : " + marka
                + ", model : " + model
                + ", Uretim Yili : " + uretimYili
                + ", Renk : " + renk
                + ", Hiz : " + hiz);
    }

}
