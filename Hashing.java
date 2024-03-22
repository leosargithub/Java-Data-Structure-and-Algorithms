import java.util.HashSet;
import java.util.Iterator;
public class Hashing {
    
    public static void main(String[] args) {
        

        // creating a hashset
        HashSet<Integer> set = new HashSet<>();

        // insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        // size
        System.out.println(set.size());

        // search  with contains

        if(set.contains(1)){
            System.out.println("Found");


    }

    // remove
    set.remove(1);
    if(!set.contains(1)){
        System.out.println("does not Found 1");

}

        // print all elements
        System.out.println(set);
        
        // Iterator

        Iterator<Integer> it = set.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }


}
}