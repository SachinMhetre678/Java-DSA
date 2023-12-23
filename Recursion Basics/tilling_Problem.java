import java.util.*;

public class tilling_Problem {

    public static int tillingProblem(int n){ //2 x n (floor size)
        // base case
        if(n == 0 || n == 1){
            return 1;
        }
        //kaam
        //vertical choice
        int fnm1 = tillingProblem(n-1);

        //horizontal choice
        int fnm2 = tillingProblem(n-2);

        int toWays = fnm1 + fnm2;
        return toWays;
    }

    public static void main(String args[]){
        int arr[] = {8,3,6,9,5,10,2,5,3};
        System.out.println(tillingProblem(3));
    }
}
