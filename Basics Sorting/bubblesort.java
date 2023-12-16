import java.util.*;

public class bubblesort {
    public static void bubble_sort(int a[]){
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }

    public static void printArr(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String args[]){
        int a[] = {8,99,1,6,9,18,3,16};
        bubble_sort(a);
        printArr(a);
    }
}

