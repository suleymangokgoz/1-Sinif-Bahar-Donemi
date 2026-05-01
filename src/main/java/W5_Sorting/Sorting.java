package W5_Sorting;


public class Sorting {

    public static void bubblesort(int[] array){
        for (int i = 0; i < array.length-1; i++) { //her iterasyon için
            for (int j = 0; j < array.length-i-1; j++) { //soldan sağa swap
                if(array[j]>array[j+1]){
                    int temp = array[j];//j. elemanın değerini tutmak için ara değişken
                    array[j] = array[j+1];//j+1 inci eleman j. elemana atanır
                    array[j+1] = temp;// temp (yani j.eleman da) j+1'e atanır
                }
            }
        }
    }
    
    public static void arrayprint(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int[] array = {8,5,7,3,2};
        bubblesort(array);
        arrayprint(array);
    }
    
}
