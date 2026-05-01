/*

"Recursive nedir?"
- Bir problemin, kendisinin daha küçük parçalarına bölünerek çözülmesidir.

Bir metodu recursive yapan şey, içinde kendisini çağırmasıdır. Ama bunu yaparken şu iki kutuyu doldurmak zorundasın:
 - Base Case (Durma Noktası): "Hah, bitti! Artık geri dön" dediğin yer. (Eğer bunu yazmazsan bilgisayarın beyni yanar, sonsuza kadar döner).
 - Recursive Case (Devam Adımı): "Henüz bitmedi, bir daha dön ama bu sefer daha küçük bir sayıyla dön" dediğin yer.

İlk örneğimiz : 
Diyelim ki 7. kattasın ve zemin kata (0. kat) inmek istiyorsun.

 */
package Recursive_examples;

public class C01_BASIC {

    public static void in(int kat) {

        if (kat == 0) { // 1. BASE CASE (DUR): Zemin kata geldik mi?
            System.out.println("Zemine ulastin!");
            return; // Metodu burada bitir, aşağıya bakma.
        }

        System.out.println(kat + ". kattayim, bir adim daha iniyorum."); // İşi yap
        in(kat - 1); // 2. RECURSIVE CASE (DEVAM): Bir alt kat için metodu tekrar çağır.
    }

    public static void main(String[] args) {
        int bulundugunKat = 7;
        in(bulundugunKat);

    }

}
