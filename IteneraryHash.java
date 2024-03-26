// to print a ticket hash for a given itenerary

import java.util.*;

public class IteneraryHash {

    public static String getStart(HashMap<String, String> tick){

        HashMap<String, String> revMap = new HashMap<>();

        for(String key: tick.keySet()){
            revMap.put(tick.get(key), key);
        }
        for(String key: tick.keySet()){
            if(!revMap.containsKey(key)){
                return key;
            }
        }
        return null;
    }
    
    public static void main(String[] args) {

        HashMap<String, String> tickets = new HashMap<>();

        tickets.put("Chennai", "Bangalore");
        tickets.put("Bombay", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        String start = getStart(tickets);

        while(tickets.containsKey(start)){
            System.out.print(start + " -> " + tickets.get(start) + ", ");
            start = tickets.get(start);
        }
        
    }
}
