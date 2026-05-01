 /*
değişkenleri hazırlayan metotlar constructor(yapılandırıcı) metotlardır.
Constructer(yapılandırıcı) : sınıf ile aynı adı taşıyan ve tip biilgisi içermeyen metotlardır
Bu metotlar değişkenleri hazırlayıcı görev görmektedir. 
Bir object oluşturuldugunda ilk çalışan birim bulasıdır
*/

/*
Encapsulation(kapsülleme) :
Class yapısına ait önemli değişkenler (veya spesifik metotların) dışarıdan doğrudan erişime kapatılarak
veri güvenliğinin sağlanmasıdır.
*/

package mart26_2026;


public class A01_araba {

    private String marka, model, renk;
    private int uretimyili;
    private int hiz;
    
   A01_araba(String mrk,String mdl,int uyili){ // String isimlerinin önemi yok yukardaki değişkenlerle aynı ismi kullanabiliriz.
       this.marka = mrk;
       this.model = mdl;
       this.uretimyili = 9999;
       this.hiz = 0;
   }
   
   A01_araba(String marka,String model,int uretimyili, int hiz){ // String isimleri böyle daha clean kod oluyor
       this.marka = marka;
       this.model = model;
       this.uretimyili = uretimyili;
       this.hiz = 0;
   }
   
   // Bir metot aynı isimle kullanılabilir fakat değişkenler farklı olmalıdır. Buna metot overloading denir.
   
   public int get_uretimyili(){
       return uretimyili;
   }
   
   public void set_uretimyili(int uretimyili){
       this.uretimyili = uretimyili;
   }
   
   public void hizlan(int miktar){
       if (miktar>0){
           hiz += miktar;
       }
   }
   
   public void fren(int miktar){
       if(hiz>miktar){
           hiz -= miktar;
       }
       else if(hiz<miktar){
           hiz = 0;
       }
   }
   
   public void bilgi(){
       System.out.println("Arac marka : " + marka
               + ", model : "+ model
               + ", Uretim Yili : " + uretimyili 
               + ", Hiz : " + hiz);
       
   }
   
}
