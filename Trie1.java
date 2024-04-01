public class Trie1 {

    static class Node{

        Node[] children ;
        boolean eow;

        public Node(){
         children = new Node[26];
         for(int i=0; i<26; i++){
                children[i] = null;
         }
            eow = false;
        }
    }
 static Node root = new Node();

 public static void insert(String word){
    Node curr = root; 

    for(int i=0; i<word.length(); i++){
        int index = word.charAt(i) - 'a';
        if(curr.children[index] == null){
            curr.children[index] = new Node();
        }
        if(i == word.length()-1){
            curr.children[index].eow = true;
        }

        curr = curr.children[index];
    }
 }
 public static boolean search(String key){
    Node curr = root;

    for(int i=0; i<key.length(); i++){
        int index = key.charAt(i) - 'a';
        Node node = curr.children[index];
        if(node == null){
            return false;
        }
        if(i == key.length()-1 && node.eow == false){
            return false;
        }
        curr = curr.children[index];
    }
    return true;
}

public static boolean wordBreak(String key){
    if(key.length() == 0){

        return true;
    }
     for(int i=1; i<=key.length(); i++){
        String firstPart = key.substring(0, i);
        String secPart = key.substring(i);
        if(search(firstPart) && wordBreak(secPart)){
            return true;
        }
     }
        return false;
    }

    public static boolean startWithPrefix(String prefix){
        Node curr = root;

        for(int i=0; i<prefix.length(); i++){
            int index = prefix.charAt(i) - 'a';
            Node node = curr.children[index];
            if(node == null){
                return false;
            }
            curr = curr.children[index];
        }
        return true;
    }

    public static int countNode(Node root){
        if(root == null){
            return 0;
        }
        int count = 0;
        for(int i=0; i<26; i++){
            if(root.children[i] != null){
                count += countNode(root.children[i]);
            }
        }
        return count+1;
    }

    public static String ans = "";
    public static void longestWord(Node root, StringBuilder temp){
        if(root == null){
            return;
        }
        for(int i=0; i<26; i++){
            if(root.children[i] != null){
                temp.append((char)(i+'a'));
                if(temp.length() > ans.length()){
                    ans = temp.toString();
                }
                longestWord(root.children[i], temp);
                temp.deleteCharAt(temp.length()-1);
            }
        }
    }

    public static void main(String[] args) {
        
        // String words[] = {"apple", "app", "apart", "bat", "ball", "cat", "dog", "doggy", "dogged"};

        // for(int i=0; i<words.length; i++){
        //     insert(words[i]);
        // }
        // System.out.println(search("apple"));
        // System.out.println(search("app"));
        // System.out.println(search("apart"));
        // System.out.println(search("car"));

        // wrod break problem
        // String words[] = {"i", "like", "sam", "sung", "samsung", "mobile"};
        // String key = "ilikesamsung";

        // for(int i=0; i<words.length; i++){
        //     insert(words[i]);
        // }
        
        // System.out.println(wordBreak(key));

        //start with prefix
        // String words[] = {"apple", "app", "apart", "bat", "ball", "cat", "dog", "doggy", "dogged"};
        // String prefix = "app";   

        // for(int i=0; i<words.length; i++){
        //     insert(words[i]);
        // }
        // System.out.println(startWithPrefix(prefix));

        // String str = "apple";

        // for(int i=0; i<str.length(); i++){
        //    String suffix = str.substring(i);
        //       insert(suffix);
        // }

        // System.out.println(countNode(root));

        // longest word
        String words[] = {"apple", "app", "apart", "bat", "ball", "cat", "dog", "doggy", "dogged"};

        for(int i=0; i<words.length; i++){
            insert(words[i]);
        }

        StringBuilder temp = new StringBuilder();
        longestWord(root, temp);
        System.out.println(ans);
        


    }
}
