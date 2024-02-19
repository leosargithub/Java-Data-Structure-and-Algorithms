 import java.util.*;
public class Selectionsort {
    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    } 


    public static void main(String[] args) {
        // Selection sort
        int[] arr = {5, 2, 6, 1, 3, 7, 4};
        // time complexity O(n^2)
        

        for(int i=0; i<arr.length-1; i++){

            int smallest = i;

            for(int j=i+1; j<arr.length; j++){
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        printArray(arr);
    }
    
}
