

// claculate power of a number using recursion

public class calcPower {
    
    public static int calcPowern(int x, int n){
        if(n==0){
            return 1;
        }
        if(x == 0){
            return 0;
        }
        int xnm1 = calcPowern(x, n-1);
        int xn = x * xnm1;
        return xn;
    }

    public static void main(String args[]){
     
        int x = 2, n = 5;
        int result = calcPowern(x, n);
        System.out.println(result);
        
    }
}
