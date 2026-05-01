// pass by value --> değişkenler
// pass by referance --> diziler

// variablelarda --> değerin kopyası
// object , dizi --> adresin kopyası


package A01_metotlar;

import java.util.Random;
import java.util.Scanner;

public class A10_ornek {
    
    public static void assignArray(int[] dizi){
        Random rnd = new Random();
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = rnd.nextInt(100);
        }
    }
    
    public static void assignNum(int num){
        Random rnd = new Random();
        num = rnd.nextInt(100);
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Dizide kac adet sayi olacak ? : ");
        int n = input.nextInt();
        int[] sayilar = new int[n];
        assignArray(sayilar);
        
        int number = 0;
        assignNum(number);
        
        
        
    }
    
}
