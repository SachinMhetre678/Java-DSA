package Sorting;

public class SelectionSort {

    //this function return index of min element in arr in the range start to end-1
    // [1,2,3,9,6,8,5,4,9] , start = 3 , minindex = 3, i =4 ,
    public static int getMinIndex(int[] arr,int start){
        int minIndex = start; //intially we assume that start element as min index
        for(int i = start + 1 ; i<arr.length;i++){
            // we go in the remaining array from [start+1,end-1]
            if(arr[i] < arr[minIndex]){
                //compare if min element is better than the last found element
                minIndex = i;
            }
        }
        return minIndex;
    }


    //this function applies selection sort on the given array and arranges element in inx order
    public static void selectionSort(int[] arr){
        for(int i = 0; i< arr.length;i++){
            int minIndex = getMinIndex(arr,i); // get min element from arr
            if(i != minIndex){ //if the ith elemet is the min dont swap
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,9,6,8,5,4,9};
        selectionSort(arr);
        for(int i = 0 ; i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }

    }
}
