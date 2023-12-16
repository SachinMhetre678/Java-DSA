import java.util.*;

public class counting_sort {

    public static void countingsort(int a[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            largest = Math.max(largest,a[i]);
        }
        int count[] = new int[largest+1];
        for(int i=0;i<a.length;i++){
            count[a[i]]++;
        }

        //sorting
        int j= 0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                a[j] = i;
                j++;
                count[i]--;
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
//         Arrays.sort(a); // inbuilt sort function
         countingsort(a);
         printArr(a);
    }
}
