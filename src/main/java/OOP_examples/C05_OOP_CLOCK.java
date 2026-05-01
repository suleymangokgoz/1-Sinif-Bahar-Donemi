package OOP_examples;

public class C05_OOP_CLOCK {

    private int saat, dakika, saniye;

    public C05_OOP_CLOCK(int saat, int dakika, int saniye) {
        this.saat = saat;
        this.dakika = dakika;
        this.saniye = saniye;
    }

    public void zamanIlerle() {
        saniye++;
        if (saniye == 60) {
            saniye = 0;
            dakika++;

            if (dakika == 60) {
                dakika = 0;
                saat++;

                if (saat == 24) {
                    saat = 0;
                }
            }
        }
    }

    public void saatiGoster() {
        // %02d demek: "2 haneli yaz, boş kalırsa başına 0 koy" demek
        System.out.println(String.format("%02d:%02d:%02d", saat, dakika, saniye));
    }

}
