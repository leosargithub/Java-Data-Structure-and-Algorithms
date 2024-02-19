

public class Fibonacci {
    
  public static void printFibonacci(int a, int b, int n){
      if(n==0){
          return;
      }
      int c = a + b;
        System.out.println(c);
        printFibonacci(b, c, n-1);

    }
    public static void main(String[] args){
        int  a = 0, b = 1, n = 5;
        System.out.println(a);
        System.out.println(b);
        printFibonacci(0, 1, n-2);

    }
}   
