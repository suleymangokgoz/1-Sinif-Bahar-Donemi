package Recursive_examples;

import static Recursive_examples.C03_ikininUssu.ikiUssu;
import java.util.Scanner;

public class C04_sum {
    
    public static int sumNum(int sayi){
        if(sayi == 0){
            return 0;
        }
        
        return sayi + sumNum(sayi - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("kaca kadar toplayacaksin? : ");
        int sayi = input.nextInt();
        int sonuc = sumNum(sayi);
        System.out.println("Sonuc : " + sonuc);
    }
    
}
