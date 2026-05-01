package Recursive_examples;

import java.util.Scanner;

public class C09_Fibonacci {

    public static int fibonacciHesapla(int sayi) {
        if (sayi <= 1) {
            return sayi;
        }
        return fibonacciHesapla(sayi - 1) + fibonacciHesapla(sayi - 2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Fibonaccisi hesaplanacak sayi : ");
        int sayi = input.nextInt();
        int sonuc = fibonacciHesapla(sayi);
        System.out.println("Sonuc : " + sonuc);
    }

}
