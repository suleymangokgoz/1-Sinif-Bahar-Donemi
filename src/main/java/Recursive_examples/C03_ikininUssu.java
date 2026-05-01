package Recursive_examples;

import java.util.Scanner;

public class C03_ikininUssu {
    
    public static int ikiUssu(int sayi){
        if(sayi == 0){
            return 1;
        }
        return 2 * ikiUssu(sayi - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("kacinci us ? : ");
        int us = input.nextInt();
        int sonuc = ikiUssu(us);
        System.out.println("Sonuc : " + sonuc);
    }
    
}
