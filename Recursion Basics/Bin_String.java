import java.util.*;

public class Bin_String {

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
        printBinStrings(3,0,"");
    }
}
