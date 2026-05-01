/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursive_examples;

// F(13507) > F(13507/10) > F(1350/10) > F(135/10) > F(13/10) > F(1/10) > F(0)
public class W3_Recursive {

    public static int fibonacci(int n) {
        if (n==0) {return 0;}
        if (n==1) {return 1;}
        return fibonacci(n-1)+fibonacci(n-2);
    }
    
    public static void printdigit(int n){
        if(n==0){ //Base case
            return; // durdur
        }
        System.out.println(n%10);
        printdigit(n/10);//recursive call
    }
    
    public static void countdown(int n){
        if(n==0) return; //base case
        System.out.println(n);
        countdown(n-1); // recursive call
    }
// sum(5) = 5+sum(4) = 5+4+sum(3) = 5+4+3+sum(2) = 5+4+3+2+sum(1)    
    public static int sum(int n){
        if (n==1) {
            return 1;
        }
        return n+sum(n-1);
    }
    public static int sumarray(int[] array, int index){
        if (index==array.length) {//base case
            return 0; //durdur
        }
        return array[index]+sumarray(array,index+1);//recursive case
    }
    
    public static int binarysearch(int[] array,int target){
        int left = 0;
        int right = array.length-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(array[mid]==target) {
                return mid;
            }
            else if(array[mid]<target){
                left = mid +1;
            }
            else{
                right = mid-1;
            }
        }
        return -1;                    
    }
    
    public static int bsearch_recursive(int[] array, int left, int right, int target){
        if(left>right){ //base case
            return -1;
        }
        int mid = (left+right)/2;
        if(array[mid]==target){
            return mid;
        }
        if(array[mid]>target){
            return bsearch_recursive(array,left,mid-1,target);
        }
        //else array[mid]<target
        return bsearch_recursive(array,mid+1,right,target);
    }
    
    public static void main(String[] args) {
       //Birinci örnek
       printdigit(13507);
       
       //İkinci örnek
       System.out.println();
       int a = fibonacci(5);
       System.out.println(a);
       
        //Ücüncü örnek
       System.out.println();
       countdown(5);
       
        //Dördüncü örnek
       System.out.println();
       int toplam = sum(10);
       System.out.println(toplam);
       
       //Beşinci örnek
       int[] A={1,3,6,9,11,15,17};
       int aranan = 6;
       int index = binarysearch(A,aranan);
       System.out.println(index);
       
       //Altıncı örnek
       int[] B={1,3,6,9,11,15,17,19,23,25};
       int aranan2 = 19;
       int index2 = bsearch_recursive(B,0,B.length-1,aranan2);
       System.out.println(index2);
       
       
    }
    
}
