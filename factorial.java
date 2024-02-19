
// Factorial of a number using recursion
public class factorial {

    public static int Calcfactorial(int n)
{
    if(n==0 || n==1)
    {
        return 1;
    }
   int fact_nm1 = Calcfactorial(n-1);
   int fact_n = n * fact_nm1;
    return fact_n;

}
    public static void main(String[] args){
        int n = 5;
        int result =    Calcfactorial(n);
        System.out.println(result);

    }
    
}
