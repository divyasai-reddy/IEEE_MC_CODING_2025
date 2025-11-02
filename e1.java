import java.util.*;

class climbstairs{
    public static int climbing_stairs(int n){
        if(n<=2) return n;
        else{
            return climbing_stairs(n-1)+climbing_stairs(n-2);
        }
    }
}

public class e1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of steps:");
        int n=sc.nextInt();
        System.out.println("ways:"+climbstairs.climbing_stairs(n));
        sc.close();


    }
}