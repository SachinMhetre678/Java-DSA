import java.util.*;

public class Friends_Pairing {

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

    public static void main(String args[]){
        int arr[] = {8,3,6,9,5,10,2,5,3};
        String str = "Ssaacchinmmhetreee";
        removeDuplicates(str,0,new StringBuilder(" "),new boolean[26]);
        System.out.println(friendsPairing(3));
    }
}
