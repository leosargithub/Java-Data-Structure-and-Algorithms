public class Recursion1 {
 
     public static void printNumb(int n){
        if(n==8) return; // base case (exit condition
        System.out.println(n);
        printNumb(n+1);
     }
    public static void main(String[] args){
        int n = 1;
        printNumb(n);

    }
}
