// Print sum of first n natural numbers using recursion
public class RecursionNaturalnum {
    
public static void printSum(int i, int n, int sum){

if(i ==n ){
    sum = sum + i;
    System.out.println(sum);
    return;
}
    sum = sum + i;
    printSum(i+1, n, sum);

    System.out.println(i);
}
 public static void main(String args[]){

    printSum(1, 10, 0);
 }


}
