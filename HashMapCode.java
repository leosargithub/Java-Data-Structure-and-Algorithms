import java.lang.reflect.Array;
import java.util.*;

public class HashMapCode {
    

    static class HashMap<K, V>{ // generics 

            private class Node{

                K key;
                V value;

                public Node(K key, V value){
                    this.key = key;
                    this.value = value;
                }
            }

            private int n;
            private int N;
            private LinkedList<Node>[] buckets;

            @SuppressWarnings("unchecked")
            public HashMap(){

                this.N = 4;
                this.buckets = new LinkedList[N];

                for(int i = 0; i < N; i++){
                    this.buckets[i] = new LinkedList<>();
                }
            }

            private int hashFunction(K key){
                int bi = key.hashCode();
                return Math.abs(bi) % N;
            }
            private int searchInLL(K key, int bi){
                LinkedList<Node> ll = buckets[bi];
              
             for(int i=0; i < ll.size(); i++){
                 if(ll.get(i).key.equals(key)){
                     return i;
                 }
             }
                return -1;

            }

            private void rehash(){

                LinkedList<Node>[] old = buckets;
                buckets = new LinkedList[2 * N];
                for(int i=0; i<2*N; i++){
                    buckets[i] = new LinkedList<>();
                }

               for(int i=0; i<old.length; i++){
                LinkedList<Node> ll = old[i];
                for(int j=0; j<ll.size(); j++){
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
               }

            }

            public void put(K key, V value){
                int bi = hashFunction(key);

              int di =   searchInLL(key, bi);

              if(di == -1){
                buckets[bi].addLast(new Node(key, value));
                n++;
              } else {
                // key exist 
                Node node = buckets[bi].get(di);
                node.value = value;
              }

              double lambda = (double)n / N;
              if(lambda > 2.0){
                  // rehashing

              }

            }

            public  boolean containsKey(K key){
               int bi = hashFunction(key);
                int di = searchInLL(key, bi);

                if(di == -1){
                    return false;

            }  else {
                return true;
            }
            }

            public V remove(K key){
                
                int bi = hashFunction(key);
                int di = searchInLL(key, bi);

                if(di == -1){
                    return null;
                }else{
                    Node node = buckets[bi].remove(di);
                    n--;
                    return node.value;
                }

            }


            public V get(K key){
                int bi = hashFunction(key);
                int di = searchInLL(key, bi);

                if(di == -1){
                        return null;
                }else{
                    Node node = buckets[bi].get(di);
                    return node.value;
                }
            }
            public ArrayList<K> keySet(){
                ArrayList<K> keys = new ArrayList<>();
                for(int i=0; i<buckets.length; i++){
                    LinkedList<Node> ll = buckets[i];
                    for(int j=0; j<ll.size(); j++){
                        keys.add(ll.get(j).key);
                    }
                }
                return keys;
            }

            public boolean isEmpty(){
                return  n == 0;
            }

    }

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        map.put("India", 135);
        map.put("China", 200);
        map.put("US", 100);

        ArrayList<String> keys = map.keySet();
        for(int i=0; i<keys.size(); i++){
            System.out.println(keys.get(i)+" "+map.get(keys.get(i)));
        }
        
    }
}
