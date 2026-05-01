package Recursive_examples;

public class C07_arraySum {

    public static int diziTopla(int[] dizi, int index) {
        if (index == dizi.length) {
            return 0;
        }
        return dizi[index] + diziTopla(dizi, index + 1);
    }

    public static void main(String[] args) {

        int[] sayilar = {1, 7, 5, 9, 12, 8};
        int sonuc = diziTopla(sayilar,0);
        System.out.println("Toplam : " + sonuc);

    }

}
