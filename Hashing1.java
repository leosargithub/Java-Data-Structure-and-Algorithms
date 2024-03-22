import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashing1 {
    

    public static void main(String[] args) {
        
        HashMap<String, Integer> map = new HashMap<>();

        // insertion 
        map.put("India", 135);
        map.put("China", 200);
        map.put("US", 100);
        map.put("UK", 50);

        System.out.println(map);

        map.put("China", 210);

        System.out.println(map);

        // search

        if(map.containsKey("India")){
            System.out.println("Found");
        }
        else {
            System.out.println("Not Found");
        }

        
        System.out.println(map.get("India"));
        

    }
}
