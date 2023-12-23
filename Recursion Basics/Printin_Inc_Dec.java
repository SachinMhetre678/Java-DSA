import java.util.*;

public class Printin_Inc_Dec {
    public static void printDec(int n){
        if(n==1){
            System.out.print(n);
            return ;
        }
        System.out.print(n + " ");
        printDec(n-1);
    }

    public static void printInc(int n){
        if(n==1){
            System.out.println(1);
            return ;
        }
        printInc(n-1);
        System.out.println(n + " ");
    }

    public static void main(String args[]){
        int arr[] = {8,3,6,9,5,10,2,5,3};
        int n = 26;
        printDec(n);
        printInc(n);
    }
}
