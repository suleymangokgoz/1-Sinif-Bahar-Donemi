package OOP_examples;


public class C02_OOP_BASICS_MAIN {

    public static void main(String[] args) {
        
        C01_OOP_BASICS hesap1 = new C01_OOP_BASICS("Suleyman", 45000.0);
        C01_OOP_BASICS hesap2 = new C01_OOP_BASICS("Arda", 40000.0);
        
        System.out.println(hesap1.getHesapSahibi() + " Kisisinin Baslangic Bakiyesi : " + hesap1.getBakiye());
        hesap1.paraYatir(1234);
        System.out.println(hesap1.getHesapSahibi() + " Kisisinin Bakiyesi : " + hesap1.getBakiye());
        hesap1.paraCek(9999);
        System.out.println(hesap1.getHesapSahibi() + " Kisisinin Bakiyesi : " + hesap1.getBakiye());
        
        System.out.println();
        
        System.out.println(hesap2.getHesapSahibi() + " Kisisinin Baslangic Bakiyesi : " + hesap2.getBakiye());
        hesap2.paraYatir(1234);
        System.out.println(hesap2.getHesapSahibi() + " Kisisinin Bakiyesi : " + hesap2.getBakiye());
        hesap2.paraCek(9999);
        System.out.println(hesap2.getHesapSahibi() + " Kisisinin Bakiyesi : " + hesap2.getBakiye());
        
    }
    
}
