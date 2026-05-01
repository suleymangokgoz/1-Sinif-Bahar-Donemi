package mart26_2026;


public class A04_dijitalSaat {
    
    
    private int saat, dakika, saniye;
    // get ve set metotlarını yaz.
    
    A04_dijitalSaat(){
        this.saat = 0; this.dakika = 0; this.saniye = 0;
    }
    
    A04_dijitalSaat(int saat, int dakika, int saniye){
        this.saat = saat; this.dakika = dakika; this.saniye = saniye;
    }
    
    public void ilerle(){
        saniye++;
        if(saniye==60){
            saniye = 0;
            dakika++;
        }
        if(dakika==60){
            dakika = 0;
            saat++;
        }
        if(saat==24){
            saat = 0;
        }
    }
    
    public void zamangoster(){
        System.out.println(saat + ":"+dakika+":"+saniye);
    }
}
