import java.util.*;
public class LinkL {

    public static void main(String[] args) {
        

        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("A");
        list.addFirst("is");
        System.out.println(list);
        list.addLast("linked");
        list.addLast("list");
        System.out.println(list);
    }
    
}
