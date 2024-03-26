// Union of 2 arrays 
// Given two arrays a[] and b[] of size n and m respectively. The task is to find union between these two arrays.
import java.util.*;
public class UnionHash {

    public static int union( int arr1[], int arr2[]){
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i<arr1.length; i++){
            set.add(arr1[i]);
        }
        for (int j=0; j<arr2.length; j++){
            set.add(arr2[j]);
        }
        return set.size();
    }

    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {6,7,3,1,10};
        System.out.println(union(arr1, arr2));

       
        
    }
    
}
