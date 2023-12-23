import java.util.*;

public class Summation {

    public static int Sum(int n){
        if(n==1){
            return  1;
        }
//        int prev = Sum(n-1);
        int add = n + Sum(n-1);
        return add;
    }

    public static void main(String args[]){
        int arr[] = {8,3,6,9,5,10,2,5,3};
        int n = 26;
        System.out.println(Sum(n));
    }
}
