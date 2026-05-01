package mart26_2026;


public class A03_algoSinif {
    
    String ad,soyad,harfNot;
    int vizeNot, finalNot, ogrNo;
    double ortalama;
    
    A03_algoSinif(int ogrNo, String ad, String soyad){
        this.ogrNo = ogrNo;
        this.ad = ad;
        this.soyad = soyad;
        this.vizeNot = 0;
        this.finalNot = 0;
        this.ortalama = 0;
        this.harfNot = "";
    }
    
    A03_algoSinif(int ogrNo, String ad, String soyad, int vizeNot, int finalNot){
        this.ogrNo = ogrNo;
        this.ad = ad;
        this.soyad = soyad;
        this.vizeNot = 0;
        this.finalNot = 0;
    }
    
    public void orthesap(){
        ortalama = vizeNot*0.4 + finalNot*0.6;
    }
    
    public void harfnot(){
        if(ortalama<50){
            harfNot = "F";
        }else if (ortalama>=50 && ortalama <80){
            harfNot = "B";
        }else if (ortalama>= 80){
            harfNot = "A";
        }
    }
    public void bilgi(){
        System.out.println("Ogrencinin adi : " + ad
        +"Ogrencinin soyadi : " + soyad 
        +"Vize :" + vizeNot
        +"Final :" + finalNot
        +"Ortalama : " + ortalama
        +"Harf notu : " + harfNot);
    }
    
    
}

// static metot 1 soru hoca psvm verecek metot ve parametleri anlayıp sen yukarda metot yazacaksın
// recursive
// OOP
// sourge ve short (kod istemeyecek çalışma mantıgı ve bazı farkları öğren)
// 1 tane sözel soru var ( sarmalama , encapsulation , static , private , vs.(her şey olabilir)).
// bir tane bonus soru

// metot aşırı yükleme(overloading aynı metot ismiyle farklı metotlar yazmaktır.)