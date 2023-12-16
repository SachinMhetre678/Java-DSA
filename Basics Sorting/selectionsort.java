import java.util.*;

    public static void selectionsort(int a[]){
        for(int i=0;i< a.length-1;i++){
            int minPos = i;
            for(int j= i+1;j< a.length;j++){
                if(a[minPos]>a[j]){
                    minPos = j;
                }
            }
            //Swap
            int temp = a[minPos];
            a[minPos] = a[i];
            a[i] = temp;
        }
    }

    public static void printArr(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String args[]){
        int a[] = {8,99,1,6,9,18,3,16};
        selectionsort(a);
        printArr(a);
    }
}
