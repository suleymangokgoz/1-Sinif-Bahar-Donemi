package Recursive_examples;

import java.util.Scanner;

public class C05_basamakSay {
    
    public static int basamakHesapla(int sayi){
        if(sayi == 0) {
            return 0;
        }
        
        return 1 + basamakHesapla(sayi / 10);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sayi : ");
        int sayi = input.nextInt();
        int sonuc = basamakHesapla(sayi);
        System.out.println("Basamak sayisi : " + sonuc);
    }
    
}
