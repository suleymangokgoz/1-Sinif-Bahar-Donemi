package OOP_examples;

public class C06_OOP_CLOCK_MAIN {

    public static void main(String[] args) {

        C05_OOP_CLOCK saatim = new C05_OOP_CLOCK(23, 59, 55);
        for (int i = 0; i < 10; i++) {
            saatim.saatiGoster();
            saatim.zamanIlerle();
        }
        
        /*
        Eğer hoca "Ben her saniye ekranda değiştiğini görmek istiyorum" derse,
        döngünün içine şu "uyutma" kodunu ekleyebilirsin
        Thread.sleep(1000); (Bu kod bilgisayarı 1 saniye bekletir).
        */
    }

}
