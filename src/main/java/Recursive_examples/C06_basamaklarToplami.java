/*
Sen basTopla(145) çağırdın. Bilgisayar şöyle düşünür:

basTopla(145) der ki: Benim cevabım 5 + basTopla(14) olmalı. Ama basTopla(14)'ün kaç olduğunu bilmiyorum. (Beklemeye geçer).

basTopla(14) der ki: Benim cevabım 4 + basTopla(1) olmalı. Ama basTopla(1)'i bilmiyorum. (Beklemeye geçer).

basTopla(1) der ki: Benim cevabım 1 + basTopla(0) olmalı. Ama basTopla(0)'ı bilmiyorum. (Beklemeye geçer).

basTopla(0) çalışır. İşte Base Case (Durma Noktası)!
Bu der ki: Benim cevabım 0. (Burada kimseyi beklemez, çünkü içinde basTopla çağrısı yok, direkt 0 fırlatır).

ve en son bize sonuç gelir.
*/
package Recursive_examples;

import java.util.Scanner;

public class C06_basamaklarToplami {
    
    public static int basTopla(int sayi){
        if(sayi==0){
            return 0;
        }
        return (sayi % 10) + basTopla(sayi / 10);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sayi : ");
        int sayi = input.nextInt();
        int sonuc = basTopla(sayi);
        System.out.println("Basamaklarin toplami: " + sonuc);
    }
    
}
