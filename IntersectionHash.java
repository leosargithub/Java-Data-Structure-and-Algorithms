// to find the intersection of two arrays using hashing.
import java.util.*;

public class IntersectionHash {
    public static int intersection(int arr1[], int arr2[]){

        HashSet<Integer> set = new HashSet<>();
        int count = 0;

        int n = arr1.length;
        for(int i = 0; i<n; i++){
            set.add(arr1[i]);
        }

        for(int j=0; j<arr2.length; j++){
            if(set.contains(arr2[j])){
               count++;
                set.remove(arr2[j]);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {6,7,3,1,10};
        System.out.println(intersection(arr1, arr2));
    }
    
}
