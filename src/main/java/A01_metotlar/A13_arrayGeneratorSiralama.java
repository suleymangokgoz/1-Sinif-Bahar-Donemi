package A01_metotlar;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class A13_arrayGeneratorSiralama {
    
    public static boolean contains(int[] array, int size, int number ){
        for (int i = 0; i < size; i++) {
            if(array[i]==number){
                return true;
            }
        }
        return false;
    }
    //hoca güzel bir örnek dedi
    public static int[] arrayGenerator(int N){ //birbirinden farklı 0 49 arası sayı üretici
        Random rnd = new Random();
        int[] array = new int[N];
        for (int i = 0; i < array.length; i++) {
            int number;
            do{
                number = rnd.nextInt(49);
            }while(contains(array,i,number)==true); //metot içinde metot çağırdık
            
            array[i] = number;
        }
        Arrays.sort(array); // arrayi küçükten büyüğe doğru sıralar.
        return array;
    }
    
    public static void arrayPrint(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
    
    public static void main(String[] args) {
        int[] loto = arrayGenerator(6);
        arrayPrint(loto);
        
        
    }
    
}
