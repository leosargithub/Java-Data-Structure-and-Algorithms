import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
public class ArrayLists {

    public static void main(String[] args) {
        
     ArrayList<Integer> list = new ArrayList<Integer>();
     
     // Add elements to the list
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        
        // get the element at index 1
       int element = list.get(0);
        System.out.println(list.get(element));

        // add element in between
        list.add(1, 4);
        System.out.println(list);

        // set element
        list.set(2, 5);
        System.out.println(list);

        // remove element
        list.remove(2);
        System.out.println(list);

        int size = list.size();
        System.out.println(size);
        //loops
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        // sorting
    Collections.sort(list);
    System.out.println(list);
    }
    
}
