import java.util.*;

public class insertionsort {
    public static void inerstionsort(int a[]){
        for(int i=1;i<a.length;i++){
            int curr = a[i];
            int prev = i-1;
            //finding out the correct postion to insert
            while(prev>=0 && a[prev] > curr){
                a[prev+1] = a[prev];
                prev--;
            }
            //insertion
            a[prev+1] = curr;
        }
    }

    public static void printArr(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String args[]){
        int a[] = {8,99,1,6,9,18,3,16};
         inerstionsort(a);
         printArr(a);
    }
}
