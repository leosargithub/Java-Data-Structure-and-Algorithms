import java.util.*;
public class Insertion {
    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }


    public static void main(String[] args) {
        // Insertion  sort
        int[] arr = {5, 2, 6, 1, 3, 7, 4};
        // time complexity O(n^2)
        
        for(int i=1; i<arr.length; i++){
            int current = arr[i];
            int j = i-1;
            while(j>=0 && arr[j] > current){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }

        
        printArray(arr);
    }
    
}
