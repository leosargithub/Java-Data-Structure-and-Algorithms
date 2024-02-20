public class permutationRecursion {
    public static void printPrem(String str, String permutation){
        if(str.length() == 0){
            System.out.println(permutation);
            return;
        }

        for(int i = 0; i<str.length(); i++){

            char current = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            printPrem(newStr, permutation + current);
        }
    }

    public static void main(String[] args) {

        // time complexity is O(n*n!)
        String str = "ABC";
        printPrem(str, "");
        
    }
}
