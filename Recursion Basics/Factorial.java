import java.util.*;

public class Factorial {
  
    public static int Fact(int n){
        if(n==0){
            return 1;
        }
        int fnm1 = Fact(n-1);
        int fn = n * Fact(n-1);
        return fn;
    }

    public static void main(String args[]){
        int arr[] = {8,3,6,9,5,10,2,5,3};
        int n = 26;
        System.out.println(Fact(n));

    }
}
