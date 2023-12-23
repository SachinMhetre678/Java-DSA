import java.util.*;

public class RecursionBasics {
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

    public static int Fact(int n){
        if(n==0){
            return 1;
        }
        int fnm1 = Fact(n-1);
        int fn = n * Fact(n-1);
        return fn;
    }

    public static int Sum(int n){
        if(n==1){
            return  1;
        }
//        int prev = Sum(n-1);
        int add = n + Sum(n-1);
        return add;
    }

    /* Fibonacci Series */

    public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        int fnm1 = fib(n-1);
        int fnm2 = fib(n-2);
        int fn = fnm1 + fnm2;
        return fn;
    }

    public static boolean isSorted(int arr[] , int i){
        if(i==arr.length -1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return isSorted(arr,i+1);
    }

    public static int firstOccurence(int arr[] , int key , int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOccurence(arr,key,i+1);
    }

    public static int lastOccurence(int arr[] , int key , int i){
        if(i==arr.length){
            return -1;
        }
        int isFound = lastOccurence(arr,key,i+1);
        if(isFound == -1 && arr[i]==key){
            return i;
        }
        return isFound;
    }

    public static int power(int x , int n){
        if(n == 0){
            return 1;
        }
        return x * power(x,n-1);
    }

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

    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]) {
        if(idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        //kaam
        char currChar = str.charAt(idx);
        if(map[currChar-'a'] == true) {
            //duplicate
            removeDuplicates(str, idx+1, newStr, map);
        } else {
            map[currChar-'a'] = true;
            removeDuplicates(str, idx+1, newStr.append(currChar), map);
        }
    }

    public static int friendsPairing(int n){
        if(n==1 || n==2){
            return n;
        }
        //choice
        //single
        int fnm1 = friendsPairing(n-1);

        //pair
        int fnm2 = friendsPairing(n-2);
        int pairWays = (n-1) * fnm2;

        //totWays
        int totWays = fnm1 + pairWays;
        return totWays;

        /* You can do these code in single line */
//        return friendsPairing(n-1) + (n-1) * friendsPairing(n-2);
    }

    public static void printBinStrings(int n,int lastPlace , String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        printBinStrings(n-1,0,str +"0");
        if(lastPlace==0){
            printBinStrings(n-1,1,str +"1");
        }
    }

    public static void main(String args[]){
        int arr[] = {8,3,6,9,5,10,2,5,3};
        System.out.println(tillingProblem(3));
    }
}
