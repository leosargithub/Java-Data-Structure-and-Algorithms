public class TowerofHanoi {
    public static void towerofhaoi(int n, String src, String helper, String dest){

        if(n == 1){
            System.out.println("transfer disk  "+  n  + "  from  "  + src + " to " + dest);
            return;
        }
    
    towerofhaoi(n-1, src, dest, helper);
    System.out.println("transfer disk " + n + "  from " + src + " to " + dest);
    towerofhaoi(n-1, helper, src, dest);
    }
    public static void main(String[] args){
 int n = 2;
    towerofhaoi(n, "S", "H", "D");

    }
    
}
