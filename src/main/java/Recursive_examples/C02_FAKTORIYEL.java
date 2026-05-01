package Recursive_examples;

import java.util.Scanner;

public class C02_FAKTORIYEL {

    public static int factorial(int sayi) {

        if (sayi == 0) {
            return 1;
        }
        return sayi * factorial(sayi - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Hangi sayinin faktoriyelini hesaplayacaksiniz ?");
        int sayi = scan.nextInt();

        int sonuc = factorial(sayi);
        System.out.println("Cevap: " + sonuc);
    }

}
